package com.aor.tetris.states;

import com.aor.tetris.controller.Controller;
import com.aor.tetris.controller.EndGameController;
import com.aor.tetris.model.endGame.EndGame;
import com.aor.tetris.viewer.EndGameViewer;
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
