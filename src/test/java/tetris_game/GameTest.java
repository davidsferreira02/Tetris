package tetris_game;

import tetris_game.gui.LanternaGUI;
import tetris_game.model.menu.Menu;
import tetris_game.states.Menu.MenuState;
import tetris_game.states.State;
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
