package com.aor.tetris.model;
import org.junit.jupiter.api.Assertions;
import com.aor.tetris.model.Hero.BlockHero;
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
}
