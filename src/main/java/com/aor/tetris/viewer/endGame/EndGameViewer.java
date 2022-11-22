package com.aor.tetris.viewer.endGame;

import com.aor.tetris.gui.GUI;
import com.aor.tetris.model.Hero.Position;
import com.aor.tetris.model.endGame.EndGame;
import com.aor.tetris.viewer.Viewer;

import java.io.IOException;

public class EndGameViewer extends Viewer<EndGame> {

    public EndGameViewer(EndGame endGame){
        super(endGame);
    }

    @Override
    public void draw(GUI gui) throws IOException {
        drawElements(gui);
        gui.refresh();
    }

    @Override
    protected void drawElements(GUI gui) {
        for(int i = 5;i < 17;i++) {
            for(int j = 8;j <13;j++ ) {
                gui.drawSquare(new Position(i, j), color.getColor(" BLACK"));
            }
        }

        gui.drawText(new Position(6, 9), "Y", color.getColor("RED"));
        gui.drawText(new Position(7, 9), "O", color.getColor("ORANGE"));
        gui.drawText(new Position(8, 9), "U", color.getColor("YELLOW"));
        gui.drawText(new Position(10, 9), "L ", color.getColor("GREEN"));
        gui.drawText(new Position(11, 9), "O", color.getColor("CYAN"));
        gui.drawText(new Position(12, 9), "S", color.getColor("PURPLE"));
        gui.drawText(new Position(13, 9), "E", color.getColor("RED"));

        gui.drawText(new Position(9, 11),getModel().getEntryName(),color.getColor("RED"));
    }
}