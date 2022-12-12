package tetris_game.states.endGame;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tetris_game.Game;
import tetris_game.controller.game.endGame.EndGameController;
import tetris_game.gui.GUI;
import tetris_game.model.endGame.EndGame;
import tetris_game.states.endGame.EndGameState;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

public class EndGameTest {


    public Game game;
    public EndGameController endGameController;


    @BeforeEach
    void setup() throws IOException, URISyntaxException, FontFormatException {
        this.game=Game.getInstance();
        this.endGameController = new EndGameController(new EndGame());
    }

    @Test
    void endGame(){
        game.setState(new EndGameState(new EndGame()));
        endGameController.step(game, GUI.ACTION.SELECT, 0);

        Assertions.assertEquals(tetris_game.states.menu.MenuState.class, game.getState().getClass());
    }
}

