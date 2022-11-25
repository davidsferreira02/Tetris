package com.aor.tetris;

import com.aor.tetris.gui.LanternaGUI;
import com.aor.tetris.model.menu.Menu;
import com.aor.tetris.states.Menu.MenuState;
import com.aor.tetris.states.State;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

public class GameTest {
    private Game game;
    private State state;
    private LanternaGUI gui;

    @BeforeEach
    public void setGame() throws IOException, URISyntaxException, FontFormatException {
        state = new MenuState(new Menu());
    }

    @Test
    public void GetInstanceTest() throws IOException, URISyntaxException, FontFormatException {
        game = new Game();
    }
}
