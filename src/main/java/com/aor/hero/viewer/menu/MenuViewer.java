package com.aor.hero.viewer.menu;

import com.aor.hero.gui.GUI;
import com.aor.hero.model.Position;
import com.aor.hero.model.Color;
import com.aor.hero.model.menu.Menu;
import com.aor.hero.viewer.Viewer;

import java.awt.*;

public class MenuViewer extends Viewer<Menu> {
    public MenuViewer(Menu menu) {
        super(menu);
    }

    @Override
    public void drawElements(GUI gui) {
        Color color=new Color();

        gui.drawText(new Position(7, 6), "T", color.getColor("RED"));
        gui.drawText(new Position(8, 6), "E", color.getColor("ORANGE"));
        gui.drawText(new Position(9, 6), "T", color.getColor("YELLOW"));
        gui.drawText(new Position(10, 6), "R", color.getColor("GREEN"));
        gui.drawText(new Position(11, 6), "I", color.getColor("BLUE"));
        gui.drawText(new Position(12, 6), "S", color.getColor("PURPLE"));

        for (int i = 0; i < getModel().getNumberEntries(); i++)
            gui.drawText(
                    new Position(7, 9 + i),
                    getModel().getEntry(i),
                    getModel().isSelected(i) ? "#FFD700" : "#FFFFFF");
    }
}
