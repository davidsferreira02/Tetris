package com.aor.tetris.viewer.EndGame;



import com.aor.tetris.gui.GUI;
import com.aor.tetris.model.Color;
import com.aor.tetris.model.Position;
import com.aor.tetris.model.game.EndGame.EndGame;
import com.aor.tetris.viewer.Viewer;

import javax.imageio.IIOException;
import java.io.IOException;
import java.util.List;


    public class EndGameViewer extends Viewer<EndGame> {
        public EndGameViewer(EndGame endGame) {
            super(endGame);
        }
         public void drawElements(GUI gui){
            Color color=new Color();
            gui.drawText(new Position(5,5),"E",color.getColor("ORANGE"));
             gui.drawText(new Position(6,5),"N",color.getColor("ORANGE"));
             gui.drawText(new Position(7,5),"D",color.getColor("ORANGE"));
             gui.drawText(new Position(8,5),"G",color.getColor("ORANGE"));
             gui.drawText(new Position(9,5),"A",color.getColor("ORANGE"));
             gui.drawText(new Position(10,5),"M",color.getColor("ORANGE"));
             gui.drawText(new Position(11,5),"E",color.getColor("ORANGE"));
             gui.drawText(new Position(7,13),getModel().getEntryName(),color.getColor("ORANGE"));
         }
         public void draw(GUI gui) throws IOException {
            drawElements(gui);
            gui.refresh();
         }
    }
