package com.aor.tetris.controller;

import com.aor.tetris.Game;
import com.aor.tetris.gui.GUI;
import com.aor.tetris.model.menu.Menu;
import com.aor.tetris.model.Tutorial.Tutorial;
import com.aor.tetris.states.MenuState;

public class TutorialController extends Controller<Tutorial> {
    public TutorialController(Tutorial tutorial) {
        super(tutorial);
    }

    @Override
    public void step(Game main, GUI.ACTION action, long time) {
        if (action == GUI.ACTION.SELECT) main.setState(new MenuState(new Menu()));
    }
}