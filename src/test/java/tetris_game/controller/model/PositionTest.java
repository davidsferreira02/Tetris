package tetris_game.controller.model;

import tetris_game.model.Hero.Position;
import org.junit.jupiter.api.Assertions;
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