package com.aor.tetris.states;

import com.aor.tetris.controller.Controller;
import com.aor.tetris.controller.EndGameController;
import com.aor.tetris.controller.game.ArenaController;
import com.aor.tetris.model.game.EndGame.EndGame;
import com.aor.tetris.model.game.arena.Arena;
import com.aor.tetris.viewer.EndGame.EndGameViewer;
import com.aor.tetris.viewer.Viewer;
import com.aor.tetris.viewer.game.GameViewer;

public class EndGameState extends State<EndGame> {
    public EndGameState(EndGame endGame) {
        super(endGame);
    }

    @Override
    protected Viewer<EndGame> getViewer() {
        return new EndGameViewer(getModel());
    }

    @Override
    protected Controller<EndGame> getController() {
        return new EndGameController(getModel());
    }
}

