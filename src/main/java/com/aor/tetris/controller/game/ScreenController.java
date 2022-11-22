package com.aor.tetris.controller.game;


import com.aor.tetris.Game;
import com.aor.tetris.gui.GUI;
import com.aor.tetris.model.endGame.EndGame;
import com.aor.tetris.model.Position;
import com.aor.tetris.model.menu.Menu;
import com.aor.tetris.model.game.BlockHero;
import com.aor.tetris.model.Arena.Screen;
import com.aor.tetris.states.EndGameState;
import com.aor.tetris.states.MenuState;

public class ScreenController extends GameController{
    private long lastMovement;

    public ScreenController(Screen screen){
        super(screen);
        this.lastMovement = 0;
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) {
        int endOfGame = 1;
        if(time-lastMovement>200){
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
        if (endOfGame == -1) {
            game.setState(new EndGameState(new EndGame()));
        }
    }

    private int moveDown() {
        Position[] position = getModel().getForms().moveDownPosition();
        boolean canMove = getModel().getArena().canMove(position);
        if (canMove) {
            getModel().getForms().moveDown();
            return 1;
        }
        else {
            dropBlocks();
            changeForms();
            return checkGameOver();
        }
    }
    private int checkGameOver() {
        Position[] position = getModel().getForms().getActualPosition(getModel().getForms().getCentralPosition(),getModel().getForms().getDirection());
        boolean canMove = getModel().getArena().canMove(position);
        if(!canMove){
            getModel().setForms(null);
            return -1;
        }
        return 0;
    }


    private void dropBlocks() {
        Position[] position = getModel().getForms().getActualPosition(getModel().getForms().getCentralPosition(),getModel().getForms().getDirection());
        for(Position positions : position)
            getModel().getArena().addBlock(positions,new BlockHero(getModel().getForms().getColor()));
    }



    private void changeForms(){
        getModel().setForms(getModel().getQueueOfForms().popNext());
    }


    private int dropDown() {
        int canMove = moveDown();
        while (canMove != 0){
            if(canMove == -1) return -1;
            canMove = moveDown();
        }
        return 0;
    }

    private void rotateLeft() {
        Position[] position = getModel().getForms().rotateLeftPositions();
        boolean canMove = getModel().getArena().canMove(position);
        if (canMove) getModel().getForms().rotateLeft();
    }
    private void moveLeft() {
        Position[] position = getModel().getForms().moveLeftPosition();
        boolean canMove = getModel().getArena().canMove(position);
        if (canMove) getModel().getForms().moveLeft();
    }
    private void rotateRight() {
        Position[] position = getModel().getForms().rotateRightPositions();
        boolean canMove = getModel().getArena().canMove(position);
        if (canMove) getModel().getForms().rotateRight();
    }



    private void moveRight() {
        Position[] position = getModel().getForms().moveRightPosition();
        boolean canMove = getModel().getArena().canMove(position);
        if (canMove) getModel().getForms().moveRight();
    }



}
