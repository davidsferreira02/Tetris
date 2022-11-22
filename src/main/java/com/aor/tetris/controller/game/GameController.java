package com.aor.tetris.controller.game;

import com.aor.tetris.controller.Controller;
import com.aor.tetris.model.Arena.Screen;

public abstract class GameController extends Controller<Screen> {
    public GameController(Screen screen) {
        super(screen);
    }
}