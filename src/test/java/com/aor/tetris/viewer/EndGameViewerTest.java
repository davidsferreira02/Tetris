package com.aor.tetris.viewer;

import com.aor.tetris.gui.GUI;
import com.aor.tetris.model.Color;
import com.aor.tetris.model.Position;
import com.aor.tetris.model.game.EndGame.EndGame;
import com.aor.tetris.viewer.EndGame.EndGameViewer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class EndGameViewerTest {
    private EndGame endGame;
    private GUI gui;

    private EndGameViewer endGameViewer;


    public EndGameViewerTest() {
        endGame = new EndGame();
        gui = Mockito.mock(GUI.class);
        endGameViewer = new EndGameViewer(endGame);
    }
@Test
    public void drawElementsTest() {
        endGameViewer.drawElements(gui);
        Mockito.verify(gui, Mockito.times(8)).drawText(Mockito.any(Position.class), Mockito.any(String.class),Mockito.any(String.class));
    }
    /*@Test
    public void draw(GUI gui) throws IOException {
        drawElements(gui);
        gui.refresh();
    }*/

}