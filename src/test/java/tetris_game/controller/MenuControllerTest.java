package tetris_game.controller;

import tetris_game.controller.Menu.MenuController;
import tetris_game.model.menu.Menu;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MenuControllerTest {
    private MenuController menuCon;
    private Menu menu;

    @BeforeEach
    public void SetMenu(){
        menu = new Menu();
    }

    @Test
    public void MenuControllerTest(){
        menuCon = new MenuController(menu);
    }
}
