package tetris_game.gui;


import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;

import com.googlecode.lanterna.screen.Screen;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import tetris_game.model.Hero.Color;
import tetris_game.model.Hero.Position;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

class LanternaGUITest {
    private Screen screen;
    private LanternaGUI gui;
    private TextGraphics tg;

    @BeforeEach
    void setUp() throws IOException, URISyntaxException, FontFormatException {
        screen = Mockito.mock(Screen.class);
        tg = Mockito.mock(TextGraphics.class);

        Mockito.when(screen.newTextGraphics()).thenReturn(tg);

        gui = new LanternaGUI(10,10);
    }


    @Test
    void drawHero() {
        Color color=new Color();
       // gui.drawBlockHero(new Position(1, 1), color.getColor("RED"));

        Mockito.verify(tg, Mockito.times(1)).setForegroundColor(new TextColor.RGB(255, 215, 0));
        Mockito.verify(tg, Mockito.times(1)).putString(1, 2, "H");
    }

    @Test
    void drawText() {
        gui.drawText(new Position(1, 1), "Hello World", "#336699");

        Mockito.verify(tg, Mockito.times(1)).setForegroundColor(new TextColor.RGB(51, 102, 153));
        Mockito.verify(tg, Mockito.times(1)).putString(1, 1, "Hello World");
    }


}