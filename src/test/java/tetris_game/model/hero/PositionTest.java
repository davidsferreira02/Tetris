package tetris_game.model.hero;

import org.junit.jupiter.api.AfterEach;
import tetris_game.model.hero.Position;
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
    @AfterEach
    void after(){
        position=null;
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