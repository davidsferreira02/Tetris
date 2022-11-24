package com.aor.tetris.model;

import org.junit.jupiter.api.Assertions;
import com.aor.tetris.model.Hero.BlockHero;


import com.aor.tetris.model.Hero.BlockHero;
import com.aor.tetris.model.Hero.Color;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BlockHeroTest {

    private String color;
    private BlockHero block;

    @BeforeEach
    public void setColor(){
        color = "green";
    }

    @Test
    public void BlockHeroTest(){
        block = new BlockHero(color);
        Assertions.assertEquals(block.getColor(), color);
    }


    Color color2;

    BlockHero blockHero;


    @BeforeEach
    public void setUp(){
        color2 = new Color();
        blockHero = new BlockHero(color2.getColor("BLUE"));
    }
    @Test
    public void getHeroColorTest(){
        Assertions.assertTrue(color2.getColor("BLUE").equals(blockHero.getColor()));
    }


}
