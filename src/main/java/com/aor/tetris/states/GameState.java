package com.aor.tetris.states;

import com.aor.tetris.controller.Controller;
import com.aor.tetris.controller.game.ArenaController;
import com.aor.tetris.model.game.arena.Tetris;
import com.aor.tetris.viewer.Viewer;
import com.aor.tetris.viewer.game.GameViewer;

public class GameState extends State<Tetris> {
    public GameState(Tetris arena) {
        super(arena);
    }

    @Override
    protected Viewer<Tetris> getViewer() {
        return new GameViewer(getModel());
    }

    @Override
    protected Controller<Tetris> getController() {
        return new ArenaController(getModel());
    }
}
