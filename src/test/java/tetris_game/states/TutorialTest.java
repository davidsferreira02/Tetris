package tetris_game.states;

import org.junit.jupiter.api.*;
import tetris_game.Game;
import tetris_game.controller.menu.MenuController;
import tetris_game.controller.menu.TutorialController;

import tetris_game.model.menu.Menu;
import tetris_game.gui.GUI;

import tetris_game.model.menu.Tutorial;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;


public class TutorialTest {
    TutorialController tutorialController;
    MenuController menuController;
    Menu menu;
    Game game;

    @BeforeEach
    void setUp() throws IOException, URISyntaxException, FontFormatException {
        game=Game.getInstance();
        menu=new Menu();
        menuController = new MenuController(menu);
        tutorialController = new TutorialController(new Tutorial());
    }








    @Test
    void  TutorialStateTest(){
        menuController.step(game, GUI.ACTION.DOWN, 0);
        menuController.step(game, GUI.ACTION.SELECT, 0);
        Assertions.assertEquals(tetris_game.states.menu.TutorialState.class, game.getState().getClass());
        tutorialController.step(game, GUI.ACTION.SELECT, 0);
        Assertions.assertEquals(tetris_game.states.menu.MenuState.class, game.getState().getClass());
    }



}