package tetris_game.controller.model;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tetris_game.model.Forms.Forms;
import tetris_game.model.Forms.I;
import tetris_game.model.Hero.Position;
import tetris_game.model.direction.Direction;
import org.junit.jupiter.api.BeforeEach;

import static tetris_game.model.direction.Direction.*;

public class ITest {
    private Direction direction;
    private Position[] position;
    private Forms I;

    @BeforeEach
    public void setPosition(){
        position = new Position[4];
        I = new I(new Position(0,0));
    }

    @Test
    public void IUpTest(){
        direction = UP;
        position[0] = new Position(0, 0);
        position[1] = new Position(-1, 0);
        position[2] = new Position(1, 0);
        position[3] = new Position(-2, 0);
        Position[] pos =  I.getPosition(direction);
        for(int i = 0; i != 4; i++) {
            Assertions.assertEquals(pos[i], position[i]);
        }
    }

    @Test
    public void IDownTest(){
        direction = DOWN;
        position[0] = new Position(-1, -1);
        position[1] = new Position(0, -1);
        position[2] = new Position(1, -1);
        position[3] = new Position(-2, -1);
        Position[] pos =  I.getPosition(direction);
        for(int i = 0; i != 4; i++) {
            Assertions.assertEquals(pos[i], position[i]);
        }
    }

    @Test
    public void IRightTest(){
        direction = RIGHT;
        position[0] = new Position(-1, 0);
        position[1] = new Position(-1, -1);
        position[2] = new Position(-1, -2);
        position[3] = new Position(-1, 1);
        Position[] pos =  I.getPosition(direction);
        for(int i = 0; i != 4; i++) {
            Assertions.assertEquals(pos[i], position[i]);
        }
    }

    @Test
    public void ILeftTest(){
        direction = LEFT;
        position[0] = new Position(0, 0);
        position[1] = new Position(0, -1);
        position[2] = new Position(0, -2);
        position[3] = new Position(0, 1);
        Position[] pos =  I.getPosition(direction);
        for(int i = 0; i != 4; i++) {
            Assertions.assertEquals(pos[i], position[i]);
        }
    }


}
