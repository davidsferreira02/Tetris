package com.aor.tetris.states.Menu;

import com.aor.tetris.controller.Controller;
import com.aor.tetris.controller.Menu.MenuController;
import com.aor.tetris.model.menu.Menu;
import com.aor.tetris.states.State;
import com.aor.tetris.viewer.menu.MenuViewer;
import com.aor.tetris.viewer.Viewer;


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

