package com.aor.tetris.model;

import com.aor.tetris.model.menu.Tutorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TutorialTest {
    private Tutorial tutorial;
    @BeforeEach
    void TutorialTest(){
        tutorial=new Tutorial();
    }
    @Test
    public void getEntryNameTest(){

        Assertions.assertEquals("Exit",tutorial.getEntryName());
    }

}
