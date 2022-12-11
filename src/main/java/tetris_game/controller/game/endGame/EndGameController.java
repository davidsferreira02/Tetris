package tetris_game.controller.game.endGame;

import tetris_game.Game;
import tetris_game.controller.Controller;
import tetris_game.gui.GUI;
import tetris_game.model.endGame.EndGame;
import tetris_game.model.menu.Menu;
import tetris_game.states.menu.MenuState;

public class EndGameController extends Controller<EndGame> {
    public EndGameController(EndGame endGame) {
        super(endGame);
    }

    @Override
    public void step(Game main, GUI.ACTION action, long time) {
        if (action == GUI.ACTION.SELECT) main.setState(new MenuState(new Menu()));
    }
}
