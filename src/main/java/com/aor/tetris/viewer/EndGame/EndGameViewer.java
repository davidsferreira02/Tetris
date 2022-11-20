package com.aor.tetris.viewer.EndGame;

import com.aor.tetris.gui.GUI;
import com.aor.tetris.model.Position;
import com.aor.tetris.model.game.EndGame.EndGame;
import com.aor.tetris.model.game.arena.Arena;
import com.aor.tetris.model.game.elements.Element;
import com.aor.tetris.viewer.Viewer;
import com.aor.tetris.viewer.game.ElementViewer;
import com.aor.tetris.viewer.game.HeroViewer;
import com.aor.tetris.viewer.game.MonsterViewer;
import com.aor.tetris.viewer.game.WallViewer;

import java.util.List;


    public class EndGameViewer extends Viewer<EndGame> {
        public EndGameViewer(EndGame endGame) {
            super(endGame);
        }
/*
        @Override
        public void drawElements(GUI gui) {
            drawElements(gui, getModel().getWalls(), new WallViewer());
            drawElements(gui, getModel().getMonsters(), new MonsterViewer());
            drawElement(gui, getModel().getHero(), new HeroViewer());

            gui.drawText(new Position(0, 0), "Energy: " + getModel().getHero().getEnergy(), "#FFD700");
        }

        private <T extends Element> void drawElements(GUI gui, List<T> elements, ElementViewer<T> viewer) {
            for (T element : elements)
                drawElement(gui, element, viewer);
        }

        private <T extends Element> void drawElement(GUI gui, T element, ElementViewer<T> viewer) {
            viewer.draw(element, gui);
        }
    }
*/
    }
