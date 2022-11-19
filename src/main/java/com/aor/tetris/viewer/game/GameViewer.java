package com.aor.tetris.viewer.game;

import com.aor.tetris.gui.GUI;
import com.aor.tetris.model.Position;
import com.aor.tetris.viewer.Viewer;
import com.aor.tetris.model.Color;

public class GameViewer extends Viewer<Arena> {
    public GameViewer(Arena arena) {
        super(arena);
    }

    @Override
    public void drawElements(GUI gui) {
        // drawElements(gui, getModel().getWalls(), new WallViewer());
        Color color = new Color();
        for (int i = 0; i < 12; i++) {
            gui.drawHero(new Position(i, 0), color.getColor("YELLOW"));
            gui.drawHero(new Position(i, 21), color.getColor("YELLOW"));
        }
        for (int i = 0; i < 21; i++) {
            gui.drawHero(new Position(0, i), color.getColor("YELLOW"));
            gui.drawHero(new Position(11, i), color.getColor("YELLOW"));
        }

    }
}