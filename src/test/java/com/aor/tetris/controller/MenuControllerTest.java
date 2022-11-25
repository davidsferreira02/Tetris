package com.aor.tetris.controller;

import com.aor.tetris.controller.Menu.MenuController;
import com.aor.tetris.model.menu.Menu;
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
