package com.aor.tetris.controller.Menu;

import com.aor.tetris.Game;
import com.aor.tetris.controller.Controller;
import com.aor.tetris.gui.GUI;
import com.aor.tetris.model.Arena.Screen;
import com.aor.tetris.model.menu.Menu;
import com.aor.tetris.model.menu.Tutorial;
import com.aor.tetris.states.game.GameState;
import com.aor.tetris.states.Menu.TutorialState;

public class MenuController extends Controller<Menu> {
    public MenuController(Menu menu) {
        super(menu);
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) {
        switch (action) {
            case UP:
                getModel().previousEntry();
                break;
            case DOWN:
                getModel().nextEntry();
                break;
            case SELECT:
                if (getModel().isSelectedExit()) game.setState(null);
                if (getModel().isSelectedPlay()) game.setState(new GameState(new Screen(20,20)));
                if (getModel().isSelectedTutorial()) game.setState(new TutorialState(new Tutorial()));
                break;
            case QUIT:
                game.setState(null);
        }
    }
}