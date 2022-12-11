package tetris_game.viewer.game;

import tetris_game.gui.GUI;
import tetris_game.model.arena.Screen;
import tetris_game.model.hero.Position;
import tetris_game.viewer.Viewer;


public class GameViewer extends Viewer<Screen> {
    public GameViewer(Screen screen){
        super(screen);
    }

    @Override
    protected void drawElements(GUI gui) {
        for(int i = 1; i <=21; i++) {
            gui.drawSquare(new Position(0, i), color.getColor("WHITE"));
            gui.drawSquare(new Position(21, i), color.getColor("WHITE"));
        }
        for(int i = 0; i <= 21; i++) {
            gui.drawSquare(new Position(i, 0), color.getColor("WHITE"));
            gui.drawSquare(new Position(i, 21), color.getColor("WHITE"));
        }
        gui.drawForms(super.getModel().getForms());
        gui.drawArena(super.getModel().getArena());
        gui.drawStats(super.getModel().getStats());
        gui.drawNextForm(super.getModel().getQueueOfForms().getLast());
        gui.drawNext();
    }
}