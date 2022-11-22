package com.aor.tetris.controller;

import com.aor.tetris.Game;
import com.aor.tetris.gui.GUI;

public abstract class Controller<T> {
    private final T model;

    public Controller(T model) {
        this.model = model;
    }

    public T getModel() {
        return model;
    }

    public abstract void step(Game main, GUI.ACTION action, long time);
}
