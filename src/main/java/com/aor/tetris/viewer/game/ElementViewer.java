package com.aor.tetris.viewer.game;

import com.aor.tetris.gui.GUI;

public interface ElementViewer<T extends Element> {
    void draw(T element, GUI gui);
}
