package com.aor.tetris.controller.menu;


import com.aor.tetris.Game;
import com.aor.tetris.controller.Controller;
import com.aor.tetris.gui.GUI;
import com.aor.tetris.model.menu.About;
import com.aor.tetris.model.menu.Menu;
import com.aor.tetris.states.MenuState;

public class AboutController extends Controller<About> {
    public AboutController(About about) {
        super(about);
    }

    @Override
    public void step(Game main, GUI.ACTION action, long time) {
        if (action == GUI.ACTION.SELECT) main.setState(new MenuState(new Menu()));
    }
}