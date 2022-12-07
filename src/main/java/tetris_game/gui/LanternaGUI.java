package tetris_game.gui;

import tetris_game.model.Arena.Arena;
import tetris_game.model.Hero.Color;
import tetris_game.model.Hero.Position;
import tetris_game.model.Forms.Forms;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.swing.AWTTerminalFontConfiguration;
import com.googlecode.lanterna.terminal.swing.AWTTerminalFrame;
import tetris_game.model.Stats;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class LanternaGUI implements GUI{
    private final Screen screen;
    private final tetris_game.model.Hero.Color colors = new Color();

    public LanternaGUI(int width, int height) throws IOException, URISyntaxException, FontFormatException {
        AWTTerminalFontConfiguration fontConfig = loadSquareFont();
        Terminal terminal = createTerminal(width, height, fontConfig);
        this.screen = createScreen(terminal);
    }

    private Screen createScreen(Terminal terminal) throws IOException {
        final Screen screen;
        screen = new TerminalScreen(terminal);

        screen.setCursorPosition(null);
        screen.startScreen();
        screen.doResizeIfNecessary();
        return screen;
    }

    private Terminal createTerminal(int width, int height, AWTTerminalFontConfiguration fontConfig) throws IOException {
        TerminalSize terminalSize = new TerminalSize(width, height);
        DefaultTerminalFactory terminalFactory = new DefaultTerminalFactory().setInitialTerminalSize(terminalSize);
        terminalFactory.setForceAWTOverSwing(true);
        terminalFactory.setTerminalEmulatorFontConfiguration(fontConfig);
        Terminal terminal = terminalFactory.createTerminal();
        ((AWTTerminalFrame) terminal).setTitle("TETRIS");
        ((AWTTerminalFrame) terminal).setIconImage(ImageIO.read(getClass().getClassLoader().getResource("NSwitchDS_Tetris.jpg")));
        return terminal;
    }

    private AWTTerminalFontConfiguration loadSquareFont() throws FontFormatException, IOException, URISyntaxException {
        URL resource = getClass().getClassLoader().getResource("fonts/square.ttf");
        File fontFile = new File(resource.toURI());
        Font font = Font.createFont(Font.TRUETYPE_FONT, fontFile);

        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        ge.registerFont(font);

        Font loadedFont = font.deriveFont(Font.PLAIN, 30);
        return AWTTerminalFontConfiguration.newInstance(loadedFont);
    }

    @Override
    public void drawText(Position position, String text, String color) {
        TextGraphics tg = screen.newTextGraphics();
        tg.setForegroundColor(TextColor.Factory.fromString(color));
        tg.putString(position.getX(), position.getY(), text);
    }

    @Override
    public void drawSquare(Position position, String color){
        TextGraphics tg = screen.newTextGraphics();
        tg.setBackgroundColor(TextColor.Factory.fromString(color));
        tg.putString(position.getX(), position.getY(), " ");
    }


    @Override
    public ACTION getNextAction() throws IOException {
        KeyStroke keyStroke = screen.pollInput();
        if (keyStroke == null) return ACTION.NONE;

        if (keyStroke.getKeyType() == KeyType.EOF) return ACTION.EXIT;
        if (keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'q') return ACTION.EXIT;
        if (keyStroke.getKeyType() == KeyType.Escape) return ACTION.EXIT;

        if (keyStroke.getKeyType() == KeyType.ArrowUp || (keyStroke.getKeyType() == KeyType.Character && Character.toLowerCase(keyStroke.getCharacter()) == 'x')) return ACTION.UP;
        if (keyStroke.getKeyType() == KeyType.ArrowRight) return ACTION.RIGHT;
        if (keyStroke.getKeyType() == KeyType.ArrowDown) return ACTION.DOWN;
        if (keyStroke.getKeyType() == KeyType.ArrowLeft) return ACTION.LEFT;
        if (keyStroke.getKeyType() == KeyType.Character && Character.toLowerCase(keyStroke.getCharacter()) == 'z') return ACTION.Z;
        if (keyStroke.getKeyType() == KeyType.Character && Character.toLowerCase(keyStroke.getCharacter()) == ' ') return ACTION.SPACE;


        if (keyStroke.getKeyType() == KeyType.Enter) return ACTION.SELECT;

        return ACTION.NONE;
    }

    @Override
    public void clear() {
        screen.clear();
    }

    @Override
    public void refresh() throws IOException {
        screen.refresh();
    }

    @Override
    public void close() throws IOException {
        screen.close();
    }

    @Override
    public void drawForms(Forms forms){
        if (forms != null) {
            for (Position position : forms.getActualPosition(forms.getCentralPosition(), forms.getDirection())) {
                drawSquare(new Position(position.getX() + 1, 1 + position.getY()), colors.getColor(forms.getColor()));
            }
        }
    }

    @Override
    public void drawArena(Arena arena){
        for(int y = 0; y < arena.getArena().length; y++){
            for(int x = 0; x < arena.getArena()[0].length; x++){
                if (arena.getArena()[y][x] != null)
                    drawSquare(new Position(x+1,1+y), colors.getColor(arena.getArena()[y][x].getColor()));
            }
        }
    }
    public void drawStats(Stats stats) {
        this.drawText(new Position(25, 1), "P", this.colors.getColor("GREEN"));
        this.drawText(new Position(26, 1), "O", this.colors.getColor("BLUE"));
        this.drawText(new Position(27, 1), "I", this.colors.getColor("PURPLE"));
        this.drawText(new Position(28, 1), "N", this.colors.getColor("RED"));
        this.drawText(new Position(29, 1), "T", this.colors.getColor("ORANGE"));
        this.drawText(new Position(30, 1), "S", this.colors.getColor("YELLOW"));
        this.drawText(new Position(26, 3), String.format("%04d", stats.getPoints()), this.colors.getColor("WHITE"));
        this.drawText(new Position(24, 5), "LEVEL", this.colors.getColor("GREEN"));
        this.drawText(new Position(31, 5), String.format("%01d", stats.getLevel()), this.colors.getColor("WHITE"));
        this.drawText(new Position(24, 7), "LINES", this.colors.getColor("YELLOW"));
        this.drawText(new Position(30, 7), String.format("%02d", stats.getLines()), this.colors.getColor("WHITE"));
    }

    public void drawNextForm(Forms forms) {
        Position[] pos = forms.getPosition(forms.getDirection());

        for(int i = 0; i < 4; ++i) {
            pos[i] = new Position(pos[i].getX() + forms.getCentralPosition().getX() + 17, pos[i].getY() + forms.getCentralPosition().getY() + 14);
        }

        if (forms != null) {
            Position[] var7 = pos;
            int var4 = pos.length;

            for(int var5 = 0; var5 < var4; ++var5) {
                Position position = var7[var5];
                this.drawSquare(new Position(position.getX() + 1, 1 + position.getY()), this.colors.getColor(forms.getColor()));
            }
        }

    }

    public void drawNext() {
        this.drawText(new Position(26, 12), "N", this.colors.getColor("GREEN"));
        this.drawText(new Position(27, 12), "E", this.colors.getColor("YELLOW"));
        this.drawText(new Position(28, 12), "X", this.colors.getColor("RED"));
        this.drawText(new Position(29, 12), "T", this.colors.getColor("PURPLE"));
        this.drawText(new Position(30, 12), ":", this.colors.getColor("ORANGE"));
    }
}
