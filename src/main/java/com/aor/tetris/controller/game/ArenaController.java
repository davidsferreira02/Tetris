package com.aor.tetris.controller.game;

import com.aor.tetris.Game;
import com.aor.tetris.gui.GUI;
import com.aor.tetris.model.Position;
import com.aor.tetris.model.game.arena.Screen;
import com.aor.tetris.model.menu.Menu;
import com.aor.tetris.states.MenuState;

public class ArenaController extends GameController {

    private long lastMovement;

    public ArenaController(Screen arena) {
        super(arena);
        this.lastMovement = 0;


    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) {
        int endOfGame = 1;
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

        }
    }


    private int moveDown() {

    return 0;
    }

    private void dropBlocks() {
   Position [] positions;
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