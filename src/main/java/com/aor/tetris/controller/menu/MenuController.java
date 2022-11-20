package com.aor.tetris.controller.menu;

import com.aor.tetris.Game;
import com.aor.tetris.controller.Controller;
import com.aor.tetris.gui.GUI;
import com.aor.tetris.model.menu.Menu;
import com.aor.tetris.model.menu.Tutorial;
import com.aor.tetris.states.TutorialState;

import java.io.IOException;

public class MenuController extends Controller<Menu> {
    public MenuController(Menu menu) {
        super(menu);
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) throws IOException {
        switch (action) {
            case UP:
                getModel().previousEntry();
                break;
            case DOWN:
                getModel().nextEntry();
                break;
            case SELECT:
                if (getModel().isSelectedExit()) game.setState(null);
               // if (getModel().isSelectedStart()) game.setState(new GameState(new Screen(new Position(10,10))));
                if (getModel().isSelectedTutorial()) game.setState(new TutorialState(new Tutorial()));
        }
    }
}
