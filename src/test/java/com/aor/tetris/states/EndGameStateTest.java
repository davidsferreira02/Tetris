package com.aor.tetris.states;

import com.aor.tetris.model.endGame.EndGame;
import com.aor.tetris.states.endGame.EndGameState;
import org.junit.jupiter.api.Assertions;
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
