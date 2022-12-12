package tetris_game.states;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tetris_game.Game;
import tetris_game.controller.menu.AboutController;
import tetris_game.controller.menu.MenuController;
import tetris_game.gui.GUI;
import tetris_game.model.menu.Menu;
import tetris_game.model.menu.About;
import tetris_game.states.menu.MenuState;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

public class AboutTest {

    AboutController aboutController;
    MenuController menuController;
    Menu menu;
    Game game;

    @BeforeEach
    void setUp() throws IOException, URISyntaxException, FontFormatException {
        game=Game.getInstance();
        menu=new Menu();
        menuController = new MenuController(menu);
        aboutController = new AboutController(new About());
    }
        @AfterEach
    void after(){
        game.setState(new MenuState(new Menu()));
        menu = null;
        menuController = null;
    }
    @Test
    void  AboutStateTest(){
        menuController.step(game, GUI.ACTION.DOWN, 0);
        menuController.step(game, GUI.ACTION.DOWN, 0);
        menuController.step(game, GUI.ACTION.SELECT, 0);
        Assertions.assertEquals(tetris_game.states.menu.AboutState.class, game.getState().getClass());
        aboutController.step(game, GUI.ACTION.SELECT, 0);
        Assertions.assertEquals(tetris_game.states.menu.MenuState.class, game.getState().getClass());
    }

}
