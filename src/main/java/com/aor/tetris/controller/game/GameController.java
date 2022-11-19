package com.aor.tetris.controller.game;

import com.aor.tetris.controller.Controller;
import com.aor.tetris.model.game.arena.Tetris;

public abstract class GameController extends Controller<Tetris> {
    public GameController(Tetris arena) {
        super(arena);
    }
}
