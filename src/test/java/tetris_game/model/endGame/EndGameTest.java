package tetris_game.model.endGame;

import org.junit.jupiter.api.AfterEach;
import tetris_game.model.endGame.EndGame;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EndGameTest {
    private String tes;
    private EndGame end;

    @BeforeEach
    public void setTes(){
        tes = "Exit";
    }

    @AfterEach
    void after(){
        tes=null;
    }

    @Test
    public void EndGameTest(){
        end = new EndGame();
        Assertions.assertEquals(end.getEntryName(), tes);
    }
}
