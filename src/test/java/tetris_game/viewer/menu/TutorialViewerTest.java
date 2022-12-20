package tetris_game.viewer.menu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import tetris_game.gui.GUI;

import tetris_game.model.menu.Tutorial;


import java.io.IOException;

public class TutorialViewerTest {

    private Tutorial tutorial;
    private GUI gui;
    private TutorialViewer tutorialViewer;

    @BeforeEach
    public void TutorialViewerTest() {
        tutorial = new Tutorial();
        gui = Mockito.mock(GUI.class);
        tutorialViewer = new TutorialViewer(tutorial);
    }
    @AfterEach
    void after(){
        tutorial=null;
        gui=null;
        tutorialViewer=null;
    }
    @Test
    void refreshAndClearTest() throws IOException {
        tutorialViewer.draw(gui);
        Mockito.verify(gui, Mockito.times(1)).clear();
        Mockito.verify(gui, Mockito.times(1)).refresh();

    }
}
