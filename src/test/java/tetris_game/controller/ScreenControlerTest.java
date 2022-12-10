package tetris_game.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tetris_game.Game;
import tetris_game.controller.game.ScreenController;
import tetris_game.gui.GUI;
import tetris_game.model.Arena.Screen;
import tetris_game.model.Forms.*;
import tetris_game.model.Hero.BlockHero;
import tetris_game.model.Hero.Position;
import tetris_game.model.direction.Direction;
import tetris_game.states.endGame.EndGameState;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

public class ScreenControlerTest {
    private ScreenController controller;
    private Game game;

    @BeforeEach
    void setUp() throws IOException, URISyntaxException, FontFormatException {
        game = Game.getInstance();
        controller = new ScreenController(new Screen(10,20));
    }



    @Test
    void moveFormsRight(){

        controller.getModel().setForms(new O(new Position(6,1)));
        controller.getModel().getForms().setCentralPosition(new Position(5, 15));
        controller.step(game, GUI.ACTION.RIGHT,0);
        Assertions.assertEquals(new Position(6, 15), controller.getModel().getForms().getCentralPosition());
        Assertions.assertEquals(Direction.UP,controller.getModel().getForms().getDirection());

        controller.getModel().getForms().setCentralPosition(new Position(10, 15));
        controller.step(game, GUI.ACTION.RIGHT,0);
        Assertions.assertEquals(new Position(10, 15), controller.getModel().getForms().getCentralPosition());
        Assertions.assertEquals(Direction.UP,controller.getModel().getForms().getDirection());
    }

    @Test
    void moveFormsLeft(){

        controller.getModel().setForms(new I(new Position(6,0)));
        controller.getModel().getForms().setCentralPosition(new Position(5, 15));
        controller.step(game, GUI.ACTION.LEFT,0);
        Assertions.assertEquals(new Position(4, 15), controller.getModel().getForms().getCentralPosition());
        Assertions.assertEquals(Direction.UP,controller.getModel().getForms().getDirection());

        controller.getModel().getForms().setCentralPosition(new Position(2, 15));
        controller.step(game, GUI.ACTION.LEFT,0);
        Assertions.assertEquals(new Position(2, 15), controller.getModel().getForms().getCentralPosition());
        Assertions.assertEquals(Direction.UP,controller.getModel().getForms().getDirection());
    }

    @Test
    void rotateFormsRight(){

        controller.getModel().setForms(new S(new Position(5,0)));
        controller.getModel().getForms().setCentralPosition(new Position(5, 15));
        controller.step(game, GUI.ACTION.UP,0);
        Assertions.assertEquals(new Position(5, 15), controller.getModel().getForms().getCentralPosition());
        Assertions.assertEquals(Direction.RIGHT,controller.getModel().getForms().getDirection());
        controller.step(game, GUI.ACTION.UP,0);
        controller.step(game, GUI.ACTION.UP,0);
        controller.step(game, GUI.ACTION.UP,0);
        Assertions.assertEquals(Direction.UP,controller.getModel().getForms().getDirection());


    }

    @Test
    void moveFormsDownAuto(){
        controller.getModel().setForms(new T(new Position(5,0)));
        controller.getModel().getForms().setCentralPosition(new Position(5, 15));
        controller.step(game, GUI.ACTION.DOWN, 1500);
        Assertions.assertEquals(new Position(5, 17),controller.getModel().getForms().getCentralPosition());
    }




    @Test
    void rotateFormsLeft(){
        controller.getModel().setForms(new J(new Position(5,0)));
        controller.getModel().getForms().setCentralPosition(new Position(5, 15));
        controller.step(game, GUI.ACTION.Z,0);
        Assertions.assertEquals(new Position(5, 15), controller.getModel().getForms().getCentralPosition());
        Assertions.assertEquals(Direction.LEFT,controller.getModel().getForms().getDirection());
        controller.step(game, GUI.ACTION.Z,0);
        controller.step(game, GUI.ACTION.Z,0);
        controller.step(game, GUI.ACTION.Z,0);
        Assertions.assertEquals(Direction.UP,controller.getModel().getForms().getDirection());

    }

    @Test
    void moveFormsDown(){
        controller.getModel().setForms(new L(new Position(5,0)));

        controller.getModel().getForms().setCentralPosition(new Position(5, 15));
        controller.step(game, GUI.ACTION.DOWN,0);
        Assertions.assertEquals(new Position(5, 16),controller.getModel().getForms().getCentralPosition());

        controller.getModel().getForms().setCentralPosition(new Position(5, 19));


        Position[] positions = controller.getModel().getForms().getActualPosition(controller.getModel().getForms().getCentralPosition(),controller.getModel().getForms().getDirection());

        controller.step(game,GUI.ACTION.DOWN,0);

        for(int i= 0; i < 4;i++){
            Assertions.assertFalse(controller.getModel().getArena().BlockcanOccupy(positions[i]));
        }

        if(controller.getModel().getForms().getClass() == I.class){
            Assertions.assertEquals(new Position(5,0),controller.getModel().getForms().getCentralPosition());
        }
        else{
            Assertions.assertEquals(new Position(5,1),controller.getModel().getForms().getCentralPosition());
        }

        controller.getModel().setForms(new Z(new Position(5,18)));
        positions = controller.getModel().getForms().getActualPosition(controller.getModel().getForms().getCentralPosition(),controller.getModel().getForms().getDirection());
        controller.step(game,GUI.ACTION.DOWN,0);
        for(int i= 0; i < 4;i++){
            Assertions.assertFalse(controller.getModel().getArena().BlockcanOccupy(positions[i]));
        }


    }

    @Test
    void dropFormsDown(){
        controller.getModel().setForms(new I(new Position(5,0)));

        controller.getModel().getForms().setCentralPosition(new Position(5, 15));
        Position[] positions = controller.getModel().getForms().getActualPosition(new Position(5,19),controller.getModel().getForms().getDirection());
        controller.step(game, GUI.ACTION.SPACE,0);
        for(int i= 0; i < 4;i++){
            Assertions.assertFalse(controller.getModel().getArena().BlockcanOccupy(positions[i]));
        }

        for(int i = 0; i< 4;i++){
            controller.getModel().getArena().addBlock(new Position(i + 3,1),new BlockHero("WHITE"));
            controller.getModel().getArena().addBlock(new Position(i + 3 ,0),new BlockHero("WHITE"));
        }

        controller.step(game, GUI.ACTION.SPACE,0);
        Assertions.assertEquals(EndGameState.class,game.getState().getClass());

    }

    @Test
    void fullLines() {

        for(int i= 0; i < 3;i++){
            controller.getModel().getArena().addBlock(new Position(i,19),new BlockHero("WHITE"));
        }
        for(int i= 7; i < 10;i++){
            controller.getModel().getArena().addBlock(new Position(i,19),new BlockHero("WHITE"));
        }
        controller.getModel().setForms(new I(new Position(5,0)));
        controller.step(game,GUI.ACTION.SPACE,0);

        for(int i = 0; i< 9;i++){
            Assertions.assertTrue(controller.getModel().getArena().BlockcanOccupy(new Position(i,10)));
        }

    }

    @Test
    void fallWithTime() {
        for(int i= 0; i < 9;i++){
            controller.getModel().getArena().addBlock(new Position(i,1),new BlockHero("WHITE"));
        }
        controller.getModel().setForms(new I(new Position(5,0)));
        controller.step(game,GUI.ACTION.NONE,10000);
        Assertions.assertEquals(EndGameState.class,game.getState().getClass());

    }

}