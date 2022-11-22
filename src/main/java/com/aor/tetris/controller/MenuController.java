package com.aor.tetris.controller;

import com.aor.tetris.Game;
import com.aor.tetris.gui.GUI;
import com.aor.tetris.model.Arena.Screen;
import com.aor.tetris.model.menu.Menu;
import com.aor.tetris.model.Tutorial.Tutorial;
import com.aor.tetris.states.GameState;
import com.aor.tetris.states.TutorialState;

public class MenuController extends Controller<Menu> {
    public MenuController(Menu menu) {
        super(menu);
    }

    @Override
    public void step(Game main, GUI.ACTION action, long time) {
        switch (action) {
            case UP:
                getModel().previousEntry();
                break;
            case DOWN:
                getModel().nextEntry();
                break;
            case SELECT:
                if (getModel().isSelectedExit()) main.setState(null);
                if (getModel().isSelectedPlay()) main.setState(new GameState(new Screen(20,20)));
                if (getModel().isSelectedTutorial()) main.setState(new TutorialState(new Tutorial()));
                break;
            case QUIT:
                main.setState(null);
        }
    }
}