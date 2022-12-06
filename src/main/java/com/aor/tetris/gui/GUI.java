package com.aor.tetris.gui;
import com.aor.tetris.model.Hero.Position;
import com.aor.tetris.model.Arena.Arena;
import com.aor.tetris.model.Forms.QueueOfForms;
import com.aor.tetris.model.Forms.Forms;
import com.aor.tetris.model.Stats;

import java.io.IOException;

public interface GUI {
    ACTION getNextAction() throws IOException;



    void drawArena(Arena arena);

    void drawForms(Forms forms);


    void drawText(Position position, String text, String color);
    void drawStats(Stats stats);

    void drawSquare(Position position, String color);

    void clear();

    void refresh() throws IOException;

    void close() throws IOException;

    enum ACTION {UP, RIGHT, DOWN, LEFT, NONE,EXIT, SELECT, Z, SPACE}
}