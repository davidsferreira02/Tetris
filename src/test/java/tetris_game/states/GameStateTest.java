package tetris_game.states;

import tetris_game.model.Arena.Screen;
import tetris_game.states.game.GameState;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameStateTest {
    private Screen screen;
    private GameState game;

    @BeforeEach
    private void ScreenSet(){
        screen = new Screen(3,6);
    }


    @Test
    public void GameStateTest(){
        game = new GameState(screen);
    }
}


