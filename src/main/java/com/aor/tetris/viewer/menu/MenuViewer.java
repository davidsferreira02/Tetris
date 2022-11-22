package com.aor.tetris.viewer.menu;

import com.aor.tetris.gui.GUI;
import com.aor.tetris.model.Hero.Position;
import com.aor.tetris.model.menu.Menu;
import com.aor.tetris.viewer.Viewer;

public class MenuViewer extends Viewer<Menu> {
    public MenuViewer(Menu menu) {
        super(menu);
    }

    @Override
    protected void drawElements(GUI gui) {


        gui.drawText(new Position(8, 4), "T", color.getColor("YELLOW"));
        gui.drawText(new Position(9, 4), "E", color.getColor("ORANGE"));
        gui.drawText(new Position(10, 4), "T", color.getColor("RED"));
        gui.drawText(new Position(11, 4), "R", color.getColor("GREEN"));
        gui.drawText(new Position(12, 4), "I", color.getColor("BLUE"));
        gui.drawText(new Position(13, 4), "S", color.getColor("PURPLE"));

        for (int i = 0; i < getModel().getNumEntries(); i++)
            gui.drawText(
                    new Position(7, 9 + 2*i),
                    getModel().getEntryName(i),
                    getModel().isSelected(i) ? color.getColor("BLUE") : color.getColor("WHITE"));

    }
}