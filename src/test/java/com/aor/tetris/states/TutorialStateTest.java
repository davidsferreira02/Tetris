package com.aor.tetris.states;

import com.aor.tetris.model.menu.Menu;
import com.aor.tetris.model.menu.Tutorial;
import com.aor.tetris.states.Menu.MenuState;
import com.aor.tetris.states.Menu.TutorialState;
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
