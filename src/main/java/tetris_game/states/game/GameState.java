package tetris_game.states.game;


import tetris_game.controller.Controller;
import tetris_game.controller.game.ScreenController;
import tetris_game.model.Arena.Screen;
import tetris_game.states.State;
import tetris_game.viewer.game.GameViewer;
import tetris_game.viewer.Viewer;

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