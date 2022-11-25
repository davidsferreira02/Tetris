package com.aor.tetris.states;

import com.aor.tetris.model.Arena.Screen;
import com.aor.tetris.states.game.GameState;
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


