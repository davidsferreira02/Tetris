package com.aor.tetris.states;

import com.aor.tetris.model.Arena.Screen;
import com.aor.tetris.model.menu.Menu;
import com.aor.tetris.states.Menu.MenuState;
import com.aor.tetris.states.game.GameState;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MenuStateTest {
    private Menu model;
    private MenuState state;

    @BeforeEach
    private void ModelSet(){
        model = new Menu();
    }


    @Test
    public void MenuStateTest(){
        state = new MenuState(model);
    }

}
