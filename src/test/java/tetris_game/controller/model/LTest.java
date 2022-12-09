package tetris_game.controller.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tetris_game.model.Forms.Forms;
import tetris_game.model.Forms.L;
import tetris_game.model.Hero.Position;
import tetris_game.model.direction.Direction;
import org.junit.jupiter.api.BeforeEach;

import static tetris_game.model.direction.Direction.*;

public class LTest {
    private Direction direction;
    private Position[] position;
    private Forms L;

    @BeforeEach
    public void setPosition(){
        position = new Position[4];
        L = new L(new Position(10,1));
    }

    @Test
    public void LUpTest(){
        direction = UP;
        position[0] = new Position(0, 0);
        position[1] = new Position(1, 0);
        position[2] = new Position(1, -1);
        position[3] = new Position(-1, 0);
        Position[] pos =  L.getPosition(direction);
        for(int i = 0; i != 4; i++) {
            Assertions.assertEquals(pos[i], position[i]);
        }
    }

    @Test
    public void LDownTest(){
        direction = DOWN;
        position[0] = new Position(0, 0);
        position[1] = new Position(-1, 0);
        position[2] = new Position(1, 0);
        position[3] = new Position(-1, 1);
        Position[] pos =  L.getPosition(direction);
        for(int i = 0; i != 4; i++) {
            Assertions.assertEquals(pos[i], position[i]);
        }
    }

    @Test
    public void LRightTest(){
        direction = RIGHT;
        position[0] = new Position(0, 0);
        position[1] = new Position(0, 1);
        position[2] = new Position(0, -1);
        position[3] = new Position(1, 1);
        Position[] pos =  L.getPosition(direction);
        for(int i = 0; i != 4; i++) {
            Assertions.assertEquals(pos[i], position[i]);
        }
    }

    @Test
    public void LLeftTest(){
        direction = LEFT;
        position[0] = new Position(0, 0);
        position[1] = new Position(0, -1);
        position[2] = new Position(0, 1);
        position[3] = new Position(-1, -1);
        Position[] pos =  L.getPosition(direction);
        for(int i = 0; i != 4; i++) {
            Assertions.assertEquals(pos[i], position[i]);
        }
    }
}
