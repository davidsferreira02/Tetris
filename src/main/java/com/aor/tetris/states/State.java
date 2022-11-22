package com.aor.tetris.states;

import com.aor.tetris.Game;
import com.aor.tetris.controller.Controller;
import com.aor.tetris.gui.GUI;
import com.aor.tetris.viewer.Viewer;

import java.io.IOException;


public abstract class State <T> {
    private final T model;
    private final Controller<T> controller;
    private final Viewer<T> viewer;

    public State(T model) {
        this.model = model;
        this.viewer = getViewer();
        this.controller = getController();
    }

    protected abstract Viewer<T> getViewer();

    protected abstract Controller<T> getController();

    public T getModel() {
        return model;
    }

    public void step(Game main, GUI gui, long time) throws IOException {
        GUI.ACTION action = gui.getNextAction();
        controller.step(main, action, time);
        viewer.draw(gui);
    }
}

