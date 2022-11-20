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

        Position [] position=getModel().getForms().moveDownPositions();
        return 0;
    }

    private void dropBlocks(){

        }





    private void moveRight() {
        Position [] position=getModel().getForms().moveRightPositions();

    }

    private void moveLeft() {
        Position [] position=getModel().getForms().moveLeftPositions();

    }

    private void rotateRight() {
        Position [] position=getModel().getForms().rotateRightPositions();

    }

    private void rotateLeft() {
        Position [] position=getModel().getForms().rotateLeftPositions()
    }
}