package com.aor.tetris.controller.Menu;

import com.aor.tetris.Game;
import com.aor.tetris.controller.Controller;
import com.aor.tetris.gui.GUI;
import com.aor.tetris.model.menu.Menu;
import com.aor.tetris.model.menu.Tutorial;
import com.aor.tetris.states.Menu.MenuState;

public class TutorialController extends Controller<Tutorial> {
    public TutorialController(Tutorial tutorial) {
        super(tutorial);
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) {
        if (action == GUI.ACTION.SELECT) game.setState(new MenuState(new Menu()));
    }
}