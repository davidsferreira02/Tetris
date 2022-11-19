package com.aor.tetris.controller.game;

import com.aor.tetris.controller.Controller;

public abstract class GameController extends Controller<Arena> {
    public GameController(Arena arena) {
        super(arena);
    }
}
