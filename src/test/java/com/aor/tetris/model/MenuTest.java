package com.aor.tetris.model;

import com.aor.tetris.controller.Controller;
import com.aor.tetris.controller.menu.MenuController;
import com.aor.tetris.model.menu.Menu;
import com.aor.tetris.states.State;
import com.aor.tetris.viewer.Viewer;
import com.aor.tetris.viewer.menu.MenuViewer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenuTest {
    private Menu menu;
    private List<String> entries=new ArrayList<String>();

    @BeforeEach
    void MenuTest(){
        menu=new Menu();
        entries = Arrays.asList("Start", "Tutorial", "Exit");
    }

    @Test
    public void NextEntryTest(){
        menu.nextEntry();
        Assertions.assertEquals(1,menu.getCurrentEntry());
    }

    @Test
    public void PreviousEntryTest(){
        menu.nextEntry();
        menu.previousEntry();
        Assertions.assertEquals(0,menu.getCurrentEntry());
    }

    @Test
    public void getNumberEntriesTest(){
        Assertions.assertEquals(3,menu.getNumberEntries());
    }

    @Test
    public void isSelectedStartTest(){
        menu.isSelectedStart();
        Assertions.assertTrue(menu.getCurrentEntry()==0);

    }
   @Test
    public void isSelectedExitTest(){
        menu.isSelectedExit();
        Assertions.assertFalse(menu.getCurrentEntry()==2);

   }

    @Test
    public void isSelectedTutorialTest(){
        menu.isSelectedTutorial();
        Assertions.assertFalse(menu.getCurrentEntry()==1);
    }

    @Test
    public void isSelectedTest(){
        menu.nextEntry();
        Assertions.assertTrue(menu.isSelected(1));
    }
    @Test
    public void getCurentEntry(){
        menu.nextEntry();
        Assertions.assertTrue(menu.getCurrentEntry()==1);
    }

}
