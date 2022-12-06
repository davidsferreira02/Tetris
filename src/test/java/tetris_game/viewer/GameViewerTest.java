package tetris_game.viewer;

import tetris_game.model.Arena.Screen;
import tetris_game.viewer.game.GameViewer;
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
