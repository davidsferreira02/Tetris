package tetris_game.states;

import tetris_game.model.menu.Menu;
import tetris_game.states.Menu.MenuState;
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
