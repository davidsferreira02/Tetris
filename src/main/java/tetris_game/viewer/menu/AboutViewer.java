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

        gui.drawText(new Position(7, 2), "A", color.getColor("RED"));
        gui.drawText(new Position(8, 2), "B", color.getColor("ORANGE"));
        gui.drawText(new Position(9, 2), "O", color.getColor("YELLOW"));
        gui.drawText(new Position(10, 2), "U", color.getColor("GREEN"));
        gui.drawText(new Position(11, 2), "T", color.getColor("CYAN"));


        gui.drawText(new Position(1, 4), "Tetris was created ", color.getColor("RED"));
        gui.drawText(new Position(1, 5), "in June 1984", color.getColor("ORANGE"));
        gui.drawText(new Position(1, 6), "by the Russian", color.getColor("YELLOW"));
        gui.drawText(new Position(1, 7), "Alexey Pajitnov.", color.getColor("GREEN"));
        gui.drawText(new Position(1, 8), "The objective is", color.getColor("CYAN"));
        gui.drawText(new Position(1, 9), "to stack the", color.getColor("RED"));
        gui.drawText(new Position(1, 10), "pieces that come", color.getColor("ORANGE"));
        gui.drawText(new Position(1, 11), "down the screen ", color.getColor("YELLOW"));
        gui.drawText(new Position(1, 12), "which can appear", color.getColor("GREEN"));
        gui.drawText(new Position(1, 13), "mirrored and be", color.getColor("CYAN"));
        gui.drawText(new Position(1, 14), "rotated in order", color.getColor("RED"));
        gui.drawText(new Position(1, 15), "to complete", color.getColor("ORANGE"));
        gui.drawText(new Position(1, 16), "horizontal lines.", color.getColor("YELLOW"));



        gui.drawText(new Position(8, 19),getModel().getEntryName(),color.getColor("RED"));

    }
}

