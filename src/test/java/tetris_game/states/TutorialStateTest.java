package tetris_game.states;

import tetris_game.model.menu.Tutorial;
import tetris_game.states.Menu.TutorialState;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TutorialStateTest {
    private Tutorial model;
    private TutorialState state;

    @BeforeEach
    private void ModelSet(){
        model = new Tutorial();
    }


    @Test
    public void MenuStateTest(){
        state = new TutorialState(model);
    }

}
