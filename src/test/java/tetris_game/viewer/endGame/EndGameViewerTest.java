package tetris_game.viewer.endGame;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import tetris_game.gui.GUI;
import tetris_game.model.hero.Position;
import tetris_game.model.endGame.EndGame;
import tetris_game.viewer.endGame.EndGameViewer;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class EndGameViewerTest {
    private EndGame endGame;
    private GUI gui;

    private EndGameViewer endGameViewer;

@BeforeEach
    void setup() {
        endGame = new EndGame();
        gui = Mockito.mock(GUI.class);
        endGameViewer = new EndGameViewer(endGame);
    }
    @AfterEach
    void after(){
        endGame=null;
        gui=null;
        endGameViewer=null;
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