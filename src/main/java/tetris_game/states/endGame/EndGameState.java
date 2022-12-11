package tetris_game.states.endGame;

import tetris_game.controller.Controller;
import tetris_game.controller.game.endGame.EndGameController;
import tetris_game.model.endGame.EndGame;
import tetris_game.states.State;
import tetris_game.viewer.endGame.EndGameViewer;
import tetris_game.viewer.Viewer;

public class EndGameState extends State<EndGame> {

    public EndGameState(EndGame endGame) {super(endGame);}

    @Override
    protected Viewer<EndGame> getViewer() {
        return new EndGameViewer(getModel());
    }

    @Override
    protected Controller<EndGame> getController() {
        return new EndGameController(getModel());
    }
}
