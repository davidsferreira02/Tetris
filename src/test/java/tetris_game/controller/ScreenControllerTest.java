package tetris_game.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tetris_game.Game;
import tetris_game.controller.game.ScreenController;
import tetris_game.gui.GUI;
import tetris_game.model.arena.Screen;
import tetris_game.model.direction.Direction;
import tetris_game.model.forms.I;
import tetris_game.model.forms.J;
import tetris_game.model.forms.S;
import tetris_game.model.forms.T;
import tetris_game.model.hero.BlockHero;
import tetris_game.model.hero.Position;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

public class ScreenControllerTest {
    private ScreenController controller;
    private Game game;

    @BeforeEach
    void setUp() throws IOException, URISyntaxException, FontFormatException {
        game = Game.getInstance();
        controller = new ScreenController(new Screen(20,20));
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

  /*  @Test
    void fallWithTime() {
        for(int i= 0; i < 9;i++){
            controller.getModel().getArena().addBlock(new Position(i,1),new BlockHero("WHITE"));
        }
        controller.getModel().setForms(new I(new Position(5,0)));
        controller.step(game,GUI.ACTION.NONE,10000);
        Assertions.assertEquals(EndGameState.class,game.getState().getClass());

    }*/

}