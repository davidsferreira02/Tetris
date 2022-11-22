package com.aor.tetris.states;


import com.aor.tetris.controller.Controller;
import com.aor.tetris.controller.game.ScreenController;
import com.aor.tetris.model.Arena.Screen;
import com.aor.tetris.viewer.GameViewer;
import com.aor.tetris.viewer.Viewer;

public class GameState extends State<Screen> {
    public GameState(Screen screen) {super(screen);}

    @Override
    protected Viewer<Screen> getViewer() {
        return new GameViewer(getModel());
    }

    @Override
    protected Controller<Screen> getController() {
        return new ScreenController(getModel());
    }
}