package tetris_game.viewer.game;

import org.mockito.Mockito;
import tetris_game.gui.GUI;
import tetris_game.model.arena.Arena;
import tetris_game.model.arena.Screen;
import tetris_game.model.forms.Forms;
import tetris_game.model.forms.T;
import tetris_game.model.hero.Position;
import tetris_game.model.Stats;
import tetris_game.viewer.game.GameViewer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class GameViewerTest {
    private GUI gui;
    private GameViewer viewer;
    private Screen screen;

    @BeforeEach
    void setUp(){
        screen = new Screen(10, 20);
        gui = Mockito.mock(GUI.class);
        viewer = new GameViewer(screen);

        screen.setForms(new T(new Position(3, 10)));
    }

    @Test
    void drawTetrimino() throws IOException {
        viewer.draw(gui);

        Mockito.verify(gui, Mockito.times(1)).drawForms(screen.getForms());
        Mockito.verify(gui, Mockito.times(1)).drawForms(Mockito.any(Forms.class));
    }

    @Test
    void refreshAndClear() throws IOException {
        viewer.draw(gui);

        Mockito.verify(gui, Mockito.times(1)).clear();
        Mockito.verify(gui, Mockito.times(1)).refresh();

    }

    @Test
    void drawElements() throws IOException {
        viewer.draw(gui);

        Mockito.verify(gui, Mockito.times(1)).drawStats(Mockito.any(Stats.class));
        Mockito.verify(gui, Mockito.times(1)).drawArena(Mockito.any(Arena.class));
    }
}
