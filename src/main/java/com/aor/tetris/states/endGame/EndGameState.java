package com.aor.tetris.states.endGame;

import com.aor.tetris.controller.Controller;
import com.aor.tetris.controller.game.EndGame.EndGameController;
import com.aor.tetris.model.endGame.EndGame;
import com.aor.tetris.states.State;
import com.aor.tetris.viewer.endGame.EndGameViewer;
import com.aor.tetris.viewer.Viewer;

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
