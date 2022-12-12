package tetris_game.viewer.menu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import tetris_game.gui.GUI;
import tetris_game.model.menu.Menu;
import tetris_game.model.menu.Tutorial;
import tetris_game.viewer.menu.MenuViewer;
import tetris_game.viewer.menu.TutorialViewer;

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
    @Test
    void refreshAndClearTest() throws IOException {
        tutorialViewer.draw(gui);
        Mockito.verify(gui, Mockito.times(1)).clear();
        Mockito.verify(gui, Mockito.times(1)).refresh();

    }
}
