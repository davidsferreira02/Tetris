package com.aor.tetris.controller.game;

import com.aor.tetris.Game;
import com.aor.tetris.gui.GUI;
import com.aor.tetris.model.Position;
import com.aor.tetris.model.menu.Menu;
import com.aor.tetris.states.MenuState;

public class ArenaController extends GameController {

private long lastMovement;
    public ArenaController(Arena arena) {
        super(arena);
        this.lastMovement=0;


    }

    public void step(Game gmae, GUI.ACTION action, long time) {
        int endOfGame = 1;
        if(time - lastMovement > (1000/getModel().getStats().getLevel())) {
            endOfGame = moveDown();
            if (endOfGame == -1) {
                game.setState(new EndGameState(new EndGame()));
            }
            this.lastMovement = time;
        }
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
            case Z:
                rotateLeft();
                break;
            case SPACE:
                endOfGame = dropDown();
                break;
            default:
                break;
        }

        dropShadow();
        if (endOfGame == -1) {
            game.setState(new EndGameState(new EndGame()));
        }
    }

    private int moveDown() {
        Position[] positions = getModel().getTetrimino().moveDownPositions();
        boolean canMove = getModel().getBoard().canMove(positions);
        if (canMove) {
            getModel().getTetrimino().moveDown();
            return 1;
        }
        else {
            dropBlocks();
            removeAllFullLines();
            changeTetrimino();
            return checkForGameOver();
        }
    }

    private void dropBlocks() {
        Position[] positions = getModel().getTetrimino().getActualPositions(getModel().getTetrimino().getCentralPosition(),getModel().getTetrimino().getDirection());
        for(Position position : positions)
            getModel().getBoard().addBlock(position,new Block(getModel().getTetrimino().getColor()));
    }

    private void removeAllFullLines() {
        int lines = 0;
        for (int i = getModel().getHeight() -1 ;i >= 0;i--)
            if(getModel().getBoard().isLineFull(i)) {
                getModel().getBoard().removeLine(i);
                i++;
                lines++;
            }
        getModel().getStats().removedLines(lines);
    }

    private void changeTetrimino(){
        getModel().setTetrimino(getModel().getQueueOfTetrimino().popNext());
        getModel().setShadowTetrimino(getModel().getTetrimino().copy());
    }

    private int checkForGameOver() {
        Position[] positions = getModel().getTetrimino().getActualPositions(getModel().getTetrimino().getCentralPosition(),getModel().getTetrimino().getDirection());
        boolean canMove = getModel().getBoard().canMove(positions);
        if(!canMove){
            getModel().setTetrimino(null);
            return -1;
        }
        return 0;
    }

    private int dropDown() {
        int canMove = moveDown();
        while (canMove != 0){
            if(canMove == -1) return -1;
            canMove = moveDown();
        }
        return 0;
    }

    private void dropShadow() {
        if (getModel().getTetrimino() == null) return;
        getModel().getShadowTetrimino().setCentralPosition(getModel().getTetrimino().getCentralPosition());
        getModel().getShadowTetrimino().setDirection(getModel().getTetrimino().getDirection());
        boolean canMove = true;
        Position[] positions;
        while (canMove){
            positions = getModel().getShadowTetrimino().moveDownPositions();
            canMove = getModel().getBoard().canMove(positions);
            if (canMove) getModel().getShadowTetrimino().moveDown();
        }
    }

    private void moveRight() {
        Position[] positions = getModel().getTetrimino().moveRightPositions();
        boolean canMove = getModel().getBoard().canMove(positions);
        if (canMove) getModel().getTetrimino().moveRight();
    }

    private void moveLeft() {
        Position[] positions = getModel().getTetrimino().moveLeftPositions();
        boolean canMove = getModel().getBoard().canMove(positions);
        if (canMove) getModel().getTetrimino().moveLeft();
    }

    private void rotateRight() {
        Position[] positions = getModel().getTetrimino().rotateRightPositions();
        boolean canMove = getModel().getBoard().canMove(positions);
        if (canMove) getModel().getTetrimino().rotateRight();
    }

    private void rotateLeft() {
        Position[] positions = getModel().getTetrimino().rotateLeftPositions();
        boolean canMove = getModel().getBoard().canMove(positions);
        if (canMove) getModel().getTetrimino().rotateLeft();
    }
    }
}