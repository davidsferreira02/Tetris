package com.aor.tetris.model;
import org.junit.jupiter.api.Assertions;
import com.aor.tetris.model.Arena.Arena;
import com.aor.tetris.model.Arena.Screen;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ScreenTest {
    private Screen screen;
    private Arena arena;

    @BeforeEach
    public void setScreen() {
        screen = new Screen(4, 7);
        arena = new Arena(4, 7);
    }

    @Test
    public void ScreenTest(){

        Assertions.assertEquals(screen.getArena(),arena);
    }

}
