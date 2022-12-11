package tetris_game.controller.menu;

import tetris_game.Game;
import tetris_game.controller.Controller;
import tetris_game.gui.GUI;
import tetris_game.model.arena.Screen;
import tetris_game.model.menu.About;
import tetris_game.model.menu.Menu;
import tetris_game.model.menu.Tutorial;
import tetris_game.states.menu.AboutState;
import tetris_game.states.game.GameState;
import tetris_game.states.menu.TutorialState;

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
                if (getModel().isSelectedPlay()) game.setState(new GameState(new Screen(20,20)));
                if (getModel().isSelectedTutorial()) game.setState(new TutorialState(new Tutorial()));
                if (getModel().isSelectedAbout()) game.setState(new AboutState(new About()));
                if (getModel().isSelectedExit()) game.setState(null);
                break;
            case EXIT:
                game.setState(null);
        }
    }
}