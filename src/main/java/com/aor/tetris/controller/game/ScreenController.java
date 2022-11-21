package com.aor.tetris.controller.game;

import com.aor.tetris.Game;
import com.aor.tetris.gui.GUI;
import com.aor.tetris.model.Position;
import com.aor.tetris.model.game.EndGame.EndGame;
import com.aor.tetris.model.game.arena.Screen;
import com.aor.tetris.model.game.elements.BlockHero;
import com.aor.tetris.model.menu.Menu;
import com.aor.tetris.states.EndGameState;
import com.aor.tetris.states.MenuState;

public class ScreenController extends GameController {
    private long lastControl;

    public ScreenController(Screen screen){
        super(screen);
        this.lastControl = 0;
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
           default:
                break;
        }
        if (endOfGame == -1) {
            game.setState(new EndGameState(new EndGame()));
        }
    }

    private int moveDown() {
        Position[] positions = getModel().getForms().moveDownPositions();
        boolean canMove = getModel().getBlockRestrictions().canMove(positions);
        if (canMove) {
            getModel().getForms().moveDown();
            return 1;
        }
        else {
            dropBlocks();
            return 0;
        }
    }
    private void rotateLeft() {
        Position[] position = getModel().getForms().rotateLeftPositions();
        boolean canMove = getModel().getBlockRestrictions().canMove(position);
        if (canMove) getModel().getForms().rotateLeft();
    }
    private void moveLeft() {
        Position[] position = getModel().getForms().moveLeftPositions();
        boolean canMove = getModel().getBlockRestrictions().canMove(position);
        if (canMove) getModel().getForms().moveLeft();
    }
    private void rotateRight() {
        Position[] position = getModel().getForms().rotateRightPositions();
        boolean canMove = getModel().getBlockRestrictions().canMove(position);
        if (canMove) getModel().getForms().rotateRight();
    }
    private void moveRight() {
        Position[] position = getModel().getForms().moveRightPositions();
        boolean canMove = getModel().getBlockRestrictions().canMove(position);
        if (canMove) getModel().getForms().moveRight();
    }

    private void dropBlocks() {
        Position[] position = getModel().getForms().getActualPositions(getModel().getForms().getCentralPosition(),getModel().getForms().getDirection());
        for(Position positions : position)
            getModel().getBlockRestrictions().addBlockHero(new BlockHero(getModel().getForms().getColor()),positions);
    }
}
