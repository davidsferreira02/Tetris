package tetris_game.states.Menu;

import tetris_game.controller.Controller;
import tetris_game.controller.Menu.MenuController;
import tetris_game.model.menu.Menu;
import tetris_game.states.State;
import tetris_game.viewer.menu.MenuViewer;
import tetris_game.viewer.Viewer;


public class MenuState extends State<Menu> {
    public MenuState(Menu model) {
        super(model);
    }

    @Override
    protected Viewer<Menu> getViewer() {
        return new MenuViewer(getModel());
    }

    @Override
    protected Controller<Menu> getController() {
        return new MenuController(getModel());
    }
}

