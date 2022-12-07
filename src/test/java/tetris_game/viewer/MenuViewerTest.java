package tetris_game.viewer;

import tetris_game.gui.GUI;
import tetris_game.model.menu.Menu;
import tetris_game.viewer.menu.MenuViewer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class MenuViewerTest {

    private Menu menu;
    private GUI gui;
    private MenuViewer menuViewer;

    @BeforeEach
            public void MenuViewerTest() {
        menu = new Menu();
        gui = Mockito.mock(GUI.class);
        menuViewer = new MenuViewer(menu);
    }
    @Test
    void refreshAndClearTest() throws IOException {
        menuViewer.draw(gui);

        Mockito.verify(gui, Mockito.times(1)).clear();
        Mockito.verify(gui, Mockito.times(1)).refresh();

    }
}

