package com.aor.tetris.viewer;

import com.aor.tetris.model.Arena.Screen;
import com.aor.tetris.model.endGame.EndGame;
import com.aor.tetris.states.endGame.EndGameState;
import com.aor.tetris.viewer.game.GameViewer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameViewerTest {
    private Screen screen;
    private GameViewer game;

    @BeforeEach
    private void ScreenSet(){
        screen = new Screen(3,6);
    }


    @Test
    public void GameViewerTest(){
        game = new GameViewer(screen);
    }
}
