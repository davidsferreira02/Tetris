package com.aor.tetris.model;
import org.junit.jupiter.api.Assertions;
import com.aor.tetris.model.Arena.Arena;
import com.aor.tetris.model.Arena.Screen;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ScreenTest {
    private Screen screen;

    @BeforeEach
    public void setScreen() {
        screen = new Screen(4, 7);
    }

    @Test
    public void ScreenTest(){
        Arena tes = new Arena(4, 7);
        Assertions.assertEquals(screen.getArena(),tes);
    }

}
