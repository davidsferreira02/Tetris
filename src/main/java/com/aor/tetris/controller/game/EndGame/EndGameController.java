package com.aor.tetris.controller.game.EndGame;

import com.aor.tetris.Game;
import com.aor.tetris.controller.Controller;
import com.aor.tetris.gui.GUI;
import com.aor.tetris.model.endGame.EndGame;
import com.aor.tetris.model.menu.Menu;
import com.aor.tetris.states.Menu.MenuState;

public class EndGameController extends Controller<EndGame> {
    public EndGameController(EndGame endGame) {
        super(endGame);
    }

    @Override
    public void step(Game main, GUI.ACTION action, long time) {
        if (action == GUI.ACTION.SELECT) main.setState(new MenuState(new Menu()));
    }
}
