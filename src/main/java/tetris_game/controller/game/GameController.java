package tetris_game.controller.game;

import tetris_game.controller.Controller;
import tetris_game.model.arena.Screen;

public abstract class GameController extends Controller<Screen> {
    public GameController(Screen screen) {
        super(screen);
    }
}