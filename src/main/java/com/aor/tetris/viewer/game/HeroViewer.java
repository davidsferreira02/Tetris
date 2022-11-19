package com.aor.tetris.viewer.game;

import com.aor.tetris.gui.GUI;
import com.aor.tetris.model.Color;

public class HeroViewer implements ElementViewer<Hero> {
    @Override
    public void draw(Hero hero, GUI gui) {
        Color color=new Color();
        gui.drawHero(hero.getPosition(),color.getColor("RED"));
    }
}
