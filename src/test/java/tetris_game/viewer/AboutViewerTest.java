package tetris_game.viewer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import tetris_game.gui.GUI;
import tetris_game.model.menu.About;
import tetris_game.viewer.menu.AboutViewer;

import java.io.IOException;

public class AboutViewerTest {

        private About about;
        private GUI gui;
        private AboutViewer aboutViewer;

        @BeforeEach
        public void AboutViewerTest() {
            about = new About();
            gui = Mockito.mock(GUI.class);
            aboutViewer = new AboutViewer(about);
        }
        @Test
        void refreshAndClearTest() throws IOException {
            aboutViewer.draw(gui);
            Mockito.verify(gui, Mockito.times(1)).clear();
            Mockito.verify(gui, Mockito.times(1)).refresh();

        }
    }
