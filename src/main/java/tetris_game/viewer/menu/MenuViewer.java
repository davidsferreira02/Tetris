package tetris_game.viewer.menu;

import tetris_game.gui.GUI;
import tetris_game.model.Hero.Position;
import tetris_game.model.menu.Menu;
import tetris_game.viewer.Viewer;

public class MenuViewer extends Viewer<Menu> {
    public MenuViewer(Menu menu) {
        super(menu);
    }

    @Override
    protected void drawElements(GUI gui) {


        gui.drawText(new Position(12, 4), "T", color.getColor("YELLOW"));
        gui.drawText(new Position(13, 4), "E", color.getColor("ORANGE"));
        gui.drawText(new Position(14, 4), "T", color.getColor("RED"));
        gui.drawText(new Position(15, 4), "R", color.getColor("GREEN"));
        gui.drawText(new Position(16, 4), "I", color.getColor("BLUE"));
        gui.drawText(new Position(17, 4), "S", color.getColor("PURPLE"));

        for (int i = 0; i < getModel().getNumEntries(); i++)
            gui.drawText(
                    new Position(10, 9 + 2*i),
                    getModel().getEntryName(i),
                    getModel().isSelected(i) ? color.getColor("BLUE") : color.getColor("WHITE"));

    }
}