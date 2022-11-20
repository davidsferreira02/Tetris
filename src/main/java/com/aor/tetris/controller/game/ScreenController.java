package com.aor.tetris.controller.game;

import com.aor.tetris.Game;
import com.aor.tetris.gui.GUI;

import com.aor.tetris.model.Position;
import com.aor.tetris.model.menu.Menu;
import com.aor.tetris.states.MenuState;
import com.aor.tetris.model.game.arena.Screen;

public class ScreenController extends GameController {

    private long lastControl;

    public ScreenController(Screen screen) {
        super(screen);
        this.lastControl = 0;


    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) {
        int endOfGame = 1;
        this.lastControl=time;
        switch (action){
            case QUIT:
                game.setState(new MenuState(new Menu()));
                break;
            case DOWN:
                endOfGame = moveDown();
                break;
            case RIGHT:
                moveRight();
                break;
            case LEFT:
                moveLeft();
                break;
            case UP:
                rotateRight();
                break;
            case L:
                rotateLeft();
                break;
            case SPACE:
                endOfGame = 1;
                break;
            default:
                break;
        }
        if (endOfGame == -1) {
             game.setState(null);
        }
    }


    private int moveDown() {
    return 0;
    }

    private void dropBlocks(){
        Position [] position=getModel().getForms().getActualPositions(getModel().getForms().getCentralPosition(),getModel().getForms().getDirection());
        for(Position positions :position){

        }
    }





    private void moveRight() {

    }

    private void moveLeft() {

    }

    private void rotateRight() {

    }

    private void rotateLeft() {

    }
}