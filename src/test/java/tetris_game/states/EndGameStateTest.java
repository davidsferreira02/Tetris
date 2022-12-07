package tetris_game.states;

import tetris_game.model.endGame.EndGame;
import tetris_game.states.endGame.EndGameState;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EndGameStateTest {
    private EndGameState endState;
    private EndGame end;

    @BeforeEach
    private void EndGameSet(){
        end = new EndGame();
    }

    @Test
    public void EndGameStateTest(){
        endState = new EndGameState(end);
    }
}
