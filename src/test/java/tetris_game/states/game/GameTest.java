package tetris_game.states.game;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tetris_game.Game;
import tetris_game.controller.game.GameController;
import tetris_game.controller.game.ScreenController;
import tetris_game.controller.menu.MenuController;
import tetris_game.gui.GUI;
import tetris_game.model.arena.Screen;
import tetris_game.model.menu.Menu;


import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

public class GameTest {

    Game game;
    MenuController menuController;
    Menu menu;

    GameController gameController;

    @BeforeEach
    public void setup() throws IOException, URISyntaxException, FontFormatException {
     game=Game.getInstance();
     menu=new Menu();
     menuController=new MenuController(menu);
     gameController=new ScreenController(new Screen(10, 10));


    }
    @AfterEach
    void after(){
        game=null;
        menu=null;
        menuController=null;
        gameController=null;
    }
    @Test
    void menuToGameToMenu(){
        menuController.step(game, GUI.ACTION.SELECT, 0);
        Assertions.assertEquals(tetris_game.states.game.GameState.class, game.getState().getClass());
        gameController.step(game, GUI.ACTION.EXIT, 0);
        Assertions.assertEquals(tetris_game.states.menu.MenuState.class, game.getState().getClass());
    }
}
