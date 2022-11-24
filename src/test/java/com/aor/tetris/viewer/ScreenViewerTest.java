package com.aor.tetris.viewer;

import com.aor.tetris.gui.GUI;
import com.aor.tetris.model.Arena.Screen;
import com.aor.tetris.model.Hero.Position;
import com.aor.tetris.viewer.game.GameViewer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;

class ScreenViewerTest {
    private GUI gui;
    private GameViewer viewer;
    private Screen screen;

    @BeforeEach
    void setUp() {
        // screen = new screen(new Position(10,10));
        gui = Mockito.mock(GUI.class);
        viewer = new GameViewer(screen);

       // arena.setWalls(Arrays.asList(new Wall(1, 2), new Wall(2, 3), new Wall(3, 4)));
       // arena.setMonsters(Arrays.asList(new Monster(4, 5), new Monster(5, 6)));
        //arena.setHero(new Hero(5, 8));
    }


    @Test
    void drawWalls() throws IOException {
        viewer.draw(gui);

        Mockito.verify(gui, Mockito.times(1)).drawWall(new Position(1, 2));
        Mockito.verify(gui, Mockito.times(1)).drawWall(new Position(2, 3));
        Mockito.verify(gui, Mockito.times(1)).drawWall(new Position(3, 4));
        Mockito.verify(gui, Mockito.times(3)).drawWall(Mockito.any(Position.class));
    }

    @Test
    void drawMonsters() throws IOException {
        viewer.draw(gui);

        Mockito.verify(gui, Mockito.times(1)).drawMonster(new Position(4, 5));
        Mockito.verify(gui, Mockito.times(1)).drawMonster(new Position(5, 6));
        Mockito.verify(gui, Mockito.times(2)).drawMonster(Mockito.any(Position.class));
    }

    @Test
    void drawHero() throws IOException {
        viewer.draw(gui);

      //  Mockito.verify(gui, Mockito.times(1)).drawHero(new Position(5, 8));
      //  Mockito.verify(gui, Mockito.times(1)).drawHero(Mockito.any(Position.class));
    }

    @Test
    void refreshAndClear() throws IOException {
        viewer.draw(gui);

        Mockito.verify(gui, Mockito.times(1)).clear();
        Mockito.verify(gui, Mockito.times(1)).refresh();
    }
}