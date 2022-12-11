package tetris_game.viewer.menu;


import tetris_game.gui.GUI;
import tetris_game.model.Hero.Color;
import tetris_game.model.Hero.Position;
import tetris_game.model.menu.About;
import tetris_game.viewer.Viewer;

public class AboutViewer extends Viewer<About> {
    public AboutViewer(About about){
        super(about);
    }

    @Override
    protected void drawElements(GUI gui) {

        Color color=new Color();

        gui.drawText(new Position(14, 2), "A", color.getColor("RED"));
        gui.drawText(new Position(15, 2), "B", color.getColor("ORANGE"));
        gui.drawText(new Position(16, 2), "O", color.getColor("YELLOW"));
        gui.drawText(new Position(17, 2), "U", color.getColor("GREEN"));
        gui.drawText(new Position(18, 2), "T", color.getColor("CYAN"));


        gui.drawText(new Position(1, 4), "Tetris was created in June 1984", color.getColor("RED"));
        gui.drawText(new Position(1, 6), "by the Russian Alexey Pajitnov.", color.getColor("ORANGE"));
        gui.drawText(new Position(1, 8), "The objective of the game is", color.getColor("YELLOW"));
        gui.drawText(new Position(1, 10), "to stack the pieces that come", color.getColor("GREEN"));
        gui.drawText(new Position(1, 12), "down the screen which can appear", color.getColor("CYAN"));
        gui.drawText(new Position(1, 14), "mirrored and be rotated in order", color.getColor("RED"));
        gui.drawText(new Position(1, 16), "to complete horizontal lines.", color.getColor("ORANGE"));




        gui.drawText(new Position(14, 19),getModel().getEntryName(),color.getColor("RED"));

    }
}

