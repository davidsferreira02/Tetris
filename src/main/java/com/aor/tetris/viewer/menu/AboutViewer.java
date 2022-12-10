package com.aor.tetris.viewer.menu;

import com.aor.tetris.gui.GUI;
import com.aor.tetris.model.Position;
import com.aor.tetris.model.Color;
import com.aor.tetris.model.menu.About;
import com.aor.tetris.model.menu.Menu;
import com.aor.tetris.viewer.Viewer;
/*
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
*/


public class AboutViewer extends Viewer<About> {
    public AboutViewer(About about){
        super(about);
    }

    @Override
    protected void drawElements(GUI gui) {

        Color color=new Color();

        gui.drawText(new Position(7, 2), "A", color.getColor("RED"));
        gui.drawText(new Position(8, 2), "B", color.getColor("ORANGE"));
        gui.drawText(new Position(9, 2), "O", color.getColor("YELLOW"));
        gui.drawText(new Position(10, 2), "U", color.getColor("GREEN"));
        gui.drawText(new Position(11, 2), "T", color.getColor("CYAN"));


        gui.drawText(new Position(1, 4), "Tetris was created ", color.getColor("WHITE"));
        gui.drawText(new Position(1, 5), "in June 1984", color.getColor("WHITE"));
        gui.drawText(new Position(1, 6), "by the Russian", color.getColor("WHITE"));
        gui.drawText(new Position(1, 7), "Alexey Pajitnov.", color.getColor("WHITE"));
        gui.drawText(new Position(1, 8), "The objective is", color.getColor("WHITE"));
        gui.drawText(new Position(1, 9), "to stack the", color.getColor("WHITE"));
        gui.drawText(new Position(1, 10), "pieces that come", color.getColor("WHITE"));
        gui.drawText(new Position(1, 11), "down the screen ", color.getColor("WHITE"));
        gui.drawText(new Position(1, 12), "which can appear", color.getColor("WHITE"));
        gui.drawText(new Position(1, 13), "mirrored and be", color.getColor("WHITE"));
        gui.drawText(new Position(1, 14), "rotated in order", color.getColor("WHITE"));
        gui.drawText(new Position(1, 15), "to complete", color.getColor("WHITE"));
        gui.drawText(new Position(1, 16), "horizontal lines.", color.getColor("WHITE"));



        gui.drawText(new Position(8, 19),getModel().getEntryName(),color.getColor("RED"));

    }
}

