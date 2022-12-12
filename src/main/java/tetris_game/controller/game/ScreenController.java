package tetris_game.controller.game;


import tetris_game.Game;
import tetris_game.gui.GUI;
import tetris_game.model.endGame.EndGame;
import tetris_game.model.hero.Position;
import tetris_game.model.menu.Menu;
import tetris_game.model.hero.BlockHero;
import tetris_game.model.arena.Screen;
import tetris_game.states.endGame.EndGameState;
import tetris_game.states.menu.MenuState;

public class ScreenController extends GameController{
    private long lastMovement;

    public ScreenController(Screen screen){
        super(screen);
        this.lastMovement = 0;
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) {
        int endOfGame = 1;
        if(time-lastMovement>(1000/getModel().getStats().getLevel())){
            endOfGame = BlockMoveDown();
            if (endOfGame == -1) {
                this.getModel().stopMusic();
                game.setState(new EndGameState(new EndGame()));
            }
            this.lastMovement = time;
        }

        switch (action){
            case EXIT:
                this.getModel().stopMusic();
                game.setState(new MenuState(new Menu()));
                break;
            case DOWN:
                endOfGame = BlockMoveDown();
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
                endOfGame = BlockDropDown();
                break;
            default:
                break;
        }
        if (endOfGame == -1) {
            this.getModel().stopMusic();
            game.setState(new EndGameState(new EndGame()));
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

    private int BlockDropDown() {
        int BlcokCanMove =BlockMoveDown();
        while (BlcokCanMove != 0){
            if(BlcokCanMove == -1) return -1;
            BlcokCanMove = BlockMoveDown();
        }
        return 0;
    }
    private int BlockMoveDown() {
        Position[] position = getModel().getForms().moveDownPosition();
        boolean BlockCanMove = getModel().getArena().canMove(position);
        if (BlockCanMove) {
            getModel().getForms().moveDown();
            return 1;
        }
        else {
            dropBlocks();
            removeLineFull();
            changeForms();
            return checkGameOver();
        }
    }


    private void dropBlocks() {
        Position[] position = getModel().getForms().getActualPosition(getModel().getForms().getCentralPosition(),getModel().getForms().getDirection());
        for(Position positions : position)
            getModel().getArena().addBlock(positions,new BlockHero(getModel().getForms().getColor()));
    }



    private void changeForms(){
        getModel().setForms(getModel().getQueueOfForms().popNext());
    }



    private void rotateLeft() {
        Position[] position = getModel().getForms().rotateLeftPosition();
        boolean canMove = getModel().getArena().canMove(position);
        if (canMove) getModel().getForms().rotateLeft();
    }
    private void moveLeft() {
        Position[] position = getModel().getForms().moveLeftPosition();
        boolean canMove = getModel().getArena().canMove(position);
        if (canMove) getModel().getForms().moveLeft();
    }
    private void rotateRight() {
        Position[] position = getModel().getForms().rotateRightPosition();
        boolean canMove = getModel().getArena().canMove(position);
        if (canMove) getModel().getForms().rotateRight();
    }



    private void moveRight() {
        Position[] position = getModel().getForms().moveRightPosition();
        boolean canMove = getModel().getArena().canMove(position);
        if (canMove) getModel().getForms().moveRight();
    }


    public void removeLineFull() {
        int lines = 0;

        for(int i = (this.getModel()).getHeight() - 1; i >= 0; --i) {
            if ((this.getModel()).getArena().isLineFull(i)) {
                (this.getModel()).getArena().eraseLine(i);
                ++i;
                ++lines;
            }
        }

        (this.getModel()).getStats().removedLines(lines);
    }

}
