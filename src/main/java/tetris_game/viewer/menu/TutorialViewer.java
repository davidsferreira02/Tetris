package tetris_game.viewer.menu;

import tetris_game.gui.GUI;
import tetris_game.model.Hero.Position;
import tetris_game.model.menu.Tutorial;
import tetris_game.viewer.Viewer;

public class TutorialViewer extends Viewer<Tutorial> {
    public TutorialViewer(Tutorial tutorial){
        super(tutorial);
    }

    @Override
    protected void drawElements(GUI gui) {

        gui.drawText(new Position(7, 2), "T", color.getColor("RED"));
        gui.drawText(new Position(8, 2), "U", color.getColor("ORANGE"));
        gui.drawText(new Position(9, 2), "T", color.getColor("YELLOW"));
        gui.drawText(new Position(10, 2), "O", color.getColor("GREEN"));
        gui.drawText(new Position(11, 2), "R", color.getColor("CYAN"));
        gui.drawText(new Position(12, 2), "I", color.getColor("PURPLE"));
        gui.drawText(new Position(13, 2), "A", color.getColor("RED"));
        gui.drawText(new Position(14, 2), "L", color.getColor("ORANGE"));

        gui.drawText(new Position(2, 5), "LEFT", color.getColor("BLUE"));
        gui.drawText(new Position(8, 5), "MOVE LEFT", color.getColor("WHITE"));
        gui.drawText(new Position(2, 7), "RIGHT", color.getColor("BLUE"));
        gui.drawText(new Position(8, 7), "MOVE RIGHT", color.getColor("WHITE"));
        gui.drawText(new Position(2, 9), "DOWN", color.getColor("BLUE"));
        gui.drawText(new Position(8, 9), "MOVE DOWN", color.getColor("WHITE"));
        gui.drawText(new Position(2, 11), "Z", color.getColor("BLUE"));
        gui.drawText(new Position(8, 11), "ROTATE RIGHT", color.getColor("WHITE"));;
        gui.drawText(new Position(2, 13), "UP/X", color.getColor("BLUE"));
        gui.drawText(new Position(8, 13), "ROTATE LEFT", color.getColor("WHITE"));
        gui.drawText(new Position(2, 15), "SPACE", color.getColor("BLUE"));
        gui.drawText(new Position(8, 15), "DROP PIECE", color.getColor("WHITE"));
        gui.drawText(new Position(2, 17), "Q/ESC", color.getColor("BLUE"));
        gui.drawText(new Position(8, 17), "EXIT TO MENU", color.getColor("WHITE"));


        gui.drawText(new Position(9, 19),getModel().getEntryName(),color.getColor("RED"));

    }
}