package com.aor.tetris.states;

import com.aor.tetris.controller.Controller;
import com.aor.tetris.controller.game.ArenaController;
import com.aor.tetris.model.game.arena.Screen;
import com.aor.tetris.viewer.Viewer;
import com.aor.tetris.viewer.game.GameViewer;

public class GameState extends State<Screen> {
    public GameState(Screen arena) {
        super(arena);
    }

    @Override
    protected Viewer<Screen> getViewer() {
        return new GameViewer(getModel());
    }

    @Override
    protected Controller<Screen> getController() {
        return new ArenaController(getModel());
    }
}
