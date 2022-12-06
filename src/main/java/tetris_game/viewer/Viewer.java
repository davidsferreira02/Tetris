package tetris_game.viewer;

import tetris_game.gui.GUI;
import tetris_game.model.Hero.Color;

import java.io.IOException;

public abstract class Viewer <T>{
    private final T model;
    public final Color color = new Color();

    public Viewer(T model) {
        this.model = model;
    }

    public T getModel() {
        return model;
    }

    public void draw(GUI gui) throws IOException {
        gui.clear();
        drawElements(gui);
        gui.refresh();
    }

    protected abstract void drawElements(GUI gui);


}