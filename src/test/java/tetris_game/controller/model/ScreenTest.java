package tetris_game.controller.model;
import tetris_game.model.Arena.Arena;
import tetris_game.model.Arena.Screen;
import org.junit.jupiter.api.BeforeEach;

public class ScreenTest {
    private Screen screen;
    private Arena arena;

    @BeforeEach
    public void setScreen() {
        screen = new Screen(4, 7);
        arena = new Arena(4, 7);
    }
/*
    @Test
    public void ScreenTest(){

        Assertions.assertEquals(screen.getArena(),arena);
    }

 */

}
