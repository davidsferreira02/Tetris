package tetris_game.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tetris_game.Game;
import tetris_game.controller.Menu.MenuController;
import tetris_game.controller.Menu.TutorialController;
import tetris_game.controller.game.EndGame.EndGameController;
import tetris_game.controller.game.GameController;
import tetris_game.controller.game.ScreenController;
import tetris_game.gui.GUI;
import tetris_game.model.Arena.Screen;
import tetris_game.model.endGame.EndGame;
import tetris_game.model.menu.Menu;
import tetris_game.model.menu.Tutorial;
import tetris_game.states.Menu.MenuState;
import tetris_game.states.endGame.EndGameState;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

public class StatsTest {
    GameController gameController;
    TutorialController TutorialController;
    MenuController menuController;
    EndGameController endGameController;
    Menu menu;
    Game game;

    @BeforeEach
    void setUp() throws IOException, URISyntaxException, FontFormatException {
        game = Game.getInstance();
        menu = new Menu();
        menuController = new MenuController(menu);
        gameController = new ScreenController(new Screen(22, 22));
        TutorialController = new TutorialController(new Tutorial());
        endGameController = new EndGameController(new EndGame());
    }

    @AfterEach
    void after(){
        game.setState(new MenuState(new Menu()));
        menu = null;
        menuController = null;
    }


    @Test
    void actionDown(){
        menuController.step(game, GUI.ACTION.DOWN, 0);
        Assertions.assertTrue(menuController.getModel().isSelectedTutorial());
    }

    @Test
    void actionUp(){
        menuController.step(game, GUI.ACTION.UP, 0);
        Assertions.assertTrue(menuController.getModel().isSelectedExit());
    }

    @Test
    void actionQuit(){
        menuController.step(game, GUI.ACTION.EXIT, 0);
        Assertions.assertNull(game.getState());
    }

    @Test
    void actionSelect(){
        menuController.step(game, GUI.ACTION.DOWN, 0);
        menuController.step(game, GUI.ACTION.SELECT, 0);
        Assertions.assertEquals(tetris_game.states.Menu.TutorialState.class, game.getState().getClass());
    }

    @Test
    void menuToGameToMenu(){
        menuController.step(game, GUI.ACTION.SELECT, 0);
        Assertions.assertEquals(tetris_game.states.game.GameState.class, game.getState().getClass());
        gameController.step(game, GUI.ACTION.EXIT, 0);
        Assertions.assertEquals(tetris_game.states.Menu.MenuState.class, game.getState().getClass());
    }

    @Test
    void menuToTutorialToMenu(){
        menuController.step(game, GUI.ACTION.DOWN, 0);
        menuController.step(game, GUI.ACTION.SELECT, 0);
        Assertions.assertEquals(tetris_game.states.Menu.TutorialState.class, game.getState().getClass());
        TutorialController.step(game, GUI.ACTION.SELECT, 0);
        Assertions.assertEquals(tetris_game.states.Menu.MenuState.class, game.getState().getClass());
    }

    @Test
    void endGameToMenu(){
        game.setState(new EndGameState(new EndGame()));
        endGameController.step(game, GUI.ACTION.SELECT, 0);
        Assertions.assertEquals(tetris_game.states.Menu.MenuState.class, game.getState().getClass());
    }

}
