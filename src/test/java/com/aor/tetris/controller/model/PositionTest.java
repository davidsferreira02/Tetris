package com.aor.tetris.controller.model;

import com.aor.tetris.model.Hero.Position;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class PositionTest {
    private Position position;


    @BeforeEach
    public void setup(){
        position=new Position(12,12);
    }
    @Test
    public void getX(){
        Assertions.assertEquals(12,position.getX());
    }
    @Test
    public void getY(){

        Assertions.assertEquals(12,position.getY());
    }
}