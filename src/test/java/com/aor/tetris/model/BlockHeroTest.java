package com.aor.tetris.model;

import com.aor.tetris.model.Hero.BlockHero;
import com.aor.tetris.model.Hero.Color;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BlockHeroTest {

    Color color;
    BlockHero blockHero;


    @BeforeEach
    public void setUp(){
        color=new Color();
        BlockHero blockHero=new BlockHero(color.getColor("BLUE"));
    }
    @Test
    public void getHeroColorTest(){
        Assertions.assertTrue(color.getColor("BLUE").equals(blockHero.getColor()));
    }

}
