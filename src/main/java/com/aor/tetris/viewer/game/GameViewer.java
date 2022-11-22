package com.aor.tetris.viewer.game;

import com.aor.tetris.gui.GUI;
import com.aor.tetris.model.Arena.Screen;
import com.aor.tetris.model.Hero.Position;
import com.aor.tetris.viewer.Viewer;


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
    }
}