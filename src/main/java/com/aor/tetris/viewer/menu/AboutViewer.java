package com.aor.tetris.viewer.menu;

import com.aor.tetris.gui.GUI;
import com.aor.tetris.model.Position;
import com.aor.tetris.model.Color;
import com.aor.tetris.model.menu.Menu;
import com.aor.tetris.viewer.Viewer;

public class AboutViewer extends Viewer<Menu> {
    public AboutViewer(Menu about) {
        super(about);
    }

    @Override
    public void drawElements(GUI gui) {
        Color color=new Color();

        gui.drawText(new Position(1, 5), "Tetris was created in June 1984 by the Russian Alexey Pajitnov, in the midst of the Cold War. Alexey was inspired by a Greek board game called \"Pentominoes\". The objective of the game is to stack the pieces that come down the screen, which can appear mirrored and be rotated, at a speed that gradually increases with each difficulty level, in order to complete horizontal lines.", color.getColor("WHITE"));

        for (int i = 0; i < getModel().getNumberEntries(); i++)
            gui.drawText(
                    new Position(7, 9 + i),
                    getModel().getEntry(i),
                    getModel().isSelected(i) ? color.getColor("YELLOW") : color.getColor("WHITE"));
    }
}
