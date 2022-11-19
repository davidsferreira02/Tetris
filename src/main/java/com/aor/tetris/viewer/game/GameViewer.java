package com.aor.tetris.viewer.game;

import com.aor.tetris.gui.GUI;
import com.aor.tetris.model.Position;
import com.aor.tetris.model.game.arena.Screen;
import com.aor.tetris.viewer.Viewer;
import com.aor.tetris.model.Color;

public class GameViewer extends Viewer<Screen> {
    public GameViewer(Screen arena) {
        super(arena);
    }

    @Override
    public void drawElements(GUI gui) {
        // drawElements(gui, getModel().getWalls(), new WallViewer());
        Color color = new Color();
        for (int i = 0; i < 12; i++) {
            gui.drawWall(new Position(i, 0));
            gui.drawWall(new Position(i, 21));
        }
        for (int i = 0; i < 21; i++) {
            gui.drawWall(new Position(0, i));
            gui.drawWall(new Position(11, i));
        }

    }
}