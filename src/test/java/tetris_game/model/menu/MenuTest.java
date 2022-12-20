package tetris_game.model.menu;

import tetris_game.model.menu.Menu;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenuTest {
    private Menu menu;

    @BeforeEach
    void MenuTest(){
        this.menu=new Menu();
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
        Assertions.assertEquals(4,menu.getNumEntries());
    }

    @Test
    public void isSelectedStartTest(){
        menu.isSelectedPlay();
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
