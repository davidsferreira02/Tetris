package tetris_game.controller.Menu;

import tetris_game.Game;
import tetris_game.controller.Controller;
import tetris_game.gui.GUI;
import tetris_game.model.menu.Menu;
import tetris_game.model.menu.Tutorial;
import tetris_game.states.Menu.MenuState;

public class TutorialController extends Controller<Tutorial> {
    public TutorialController(Tutorial tutorial) {
        super(tutorial);
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) {
        if (action == GUI.ACTION.SELECT) game.setState(new MenuState(new Menu()));
    }
}