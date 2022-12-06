package tetris_game.gui;
import tetris_game.model.Hero.Position;
import tetris_game.model.Arena.Arena;
import tetris_game.model.Forms.Forms;

import java.io.IOException;

public interface GUI {
    ACTION getNextAction() throws IOException;



    void drawArena(Arena arena);

    void drawForms(Forms forms);


    void drawText(Position position, String text, String color);

    void drawSquare(Position position, String color);

    void clear();

    void refresh() throws IOException;

    void close() throws IOException;

    enum ACTION {UP, RIGHT, DOWN, LEFT, NONE,EXIT, SELECT, Z, SPACE}
}