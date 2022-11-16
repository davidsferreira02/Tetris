package com.aor.tetris.viewer.menu;

import com.aor.tetris.gui.GUI;
import com.aor.tetris.model.Color;
import com.aor.tetris.model.Position;

import com.aor.tetris.model.menu.Tutorial;
import com.aor.tetris.viewer.Viewer;

public class TutorialViewer extends Viewer<Tutorial> {
    public TutorialViewer(Tutorial tutorial){
        super(tutorial);
    }

    @Override
    protected void drawElements(GUI gui) {

        Color color=new Color();

        gui.drawText(new Position(7, 2), "C", color.getColor("RED"));
        gui.drawText(new Position(8, 2), "O", color.getColor("ORANGE"));
        gui.drawText(new Position(9, 2), "M", color.getColor("YELLOW"));
        gui.drawText(new Position(10, 2), "M", color.getColor("GREEN"));
        gui.drawText(new Position(11, 2), "A", color.getColor("CYAN"));
        gui.drawText(new Position(12, 2), "N", color.getColor("PURPLE"));
        gui.drawText(new Position(13, 2), "D", color.getColor("RED"));
        gui.drawText(new Position(14, 2), "S", color.getColor("ORANGE"));

        gui.drawText(new Position(2, 5), "UP/X", color.getColor("YELLOW"));
        gui.drawText(new Position(8, 5), "ROTATE LEFT", color.getColor("WHITE"));
        gui.drawText(new Position(2, 7), "Z", color.getColor("YELLOW"));
        gui.drawText(new Position(8, 7), "ROTATE RIGHT", color.getColor("WHITE"));
        gui.drawText(new Position(2, 9), "LEFT", color.getColor("YELLOW"));
        gui.drawText(new Position(8, 9), "MOVE LEFT", color.getColor("WHITE"));
        gui.drawText(new Position(2, 11), "RIGHT", color.getColor("YELLOW"));
        gui.drawText(new Position(8, 11), "MOVE RIGHT", color.getColor("WHITE"));
        gui.drawText(new Position(2, 13), "DOWN", color.getColor("YELLOW"));
        gui.drawText(new Position(8, 13), "MOVE DOWN", color.getColor("WHITE"));
        gui.drawText(new Position(2, 15), "SPACE", color.getColor("YELLOW"));
        gui.drawText(new Position(8, 15), "DROP PIECE", color.getColor("WHITE"));
        gui.drawText(new Position(2, 17), "Q/ESC", color.getColor("YELLOW"));
        gui.drawText(new Position(8, 17), "EXIT TO MENU", color.getColor("WHITE"));


        gui.drawText(new Position(9, 19),getModel().getEntryName(),color.getColor("RED"));

    }
}