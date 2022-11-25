package com.aor.tetris.viewer;

import com.aor.tetris.gui.GUI;
import com.aor.tetris.model.Hero.Position;
import com.aor.tetris.model.endGame.EndGame;
import com.aor.tetris.viewer.endGame.EndGameViewer;
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
    @Test
    public void drawTest() throws IOException{
        endGameViewer.draw(gui);
        Mockito.verify(gui,Mockito.times(1)).refresh();
    }


}