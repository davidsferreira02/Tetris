package tetris_game.controller.Menu;

import tetris_game.Game;
import tetris_game.controller.Controller;
import tetris_game.gui.GUI;
import tetris_game.model.menu.About;
import tetris_game.model.menu.Menu;

import tetris_game.states.Menu.MenuState;

public class AboutController extends Controller<About> {
    public AboutController(About about) {
        super(about);
    }

    @Override
    public void step(Game main, GUI.ACTION action, long time) {
        if (action == GUI.ACTION.SELECT) main.setState(new MenuState(new Menu()));
    }
}