package tetris_game.controller.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tetris_game.model.Forms.Forms;
import tetris_game.model.Forms.O;
import tetris_game.model.Hero.Position;
import tetris_game.model.direction.Direction;
import org.junit.jupiter.api.BeforeEach;

import static tetris_game.model.direction.Direction.*;

public class OTest {
    private Direction direction;
    private Position[] position;
    private Forms O;

    @BeforeEach
    public void setPosition(){
        position = new Position[4];
        O = new O(new Position(10,1));
    }

    @Test
    public void OUpTest(){
        direction = UP;
        position[0] = new Position(0, 0);
        position[2] = new Position(0, -1);
        position[1] = new Position(-1, 0);
        position[3] = new Position(-1, -1);
        Position[] pos =  O.getPosition(direction);
        for(int i = 0; i != 4; i++) {
            Assertions.assertEquals(pos[i], position[i]);
        }
    }

    @Test
    public void ODownTest(){
        direction = DOWN;
        position[0] = new Position(0, 0);
        position[2] = new Position(0, -1);
        position[1] = new Position(-1, 0);
        position[3] = new Position(-1, -1);
        Position[] pos =  O.getPosition(direction);
        for(int i = 0; i != 4; i++) {
            Assertions.assertEquals(pos[i], position[i]);
        }
    }

    @Test
    public void ORightTest(){
        direction = RIGHT;
        position[0] = new Position(0, 0);
        position[2] = new Position(0, -1);
        position[1] = new Position(-1, 0);
        position[3] = new Position(-1, -1);
        Position[] pos =  O.getPosition(direction);
        for(int i = 0; i != 4; i++) {
            Assertions.assertEquals(pos[i], position[i]);
        }
    }

    @Test
    public void OLeftTest(){
        direction = LEFT;
        position[0] = new Position(0, 0);
        position[2] = new Position(0, -1);
        position[1] = new Position(-1, 0);
        position[3] = new Position(-1, -1);
        Position[] pos =  O.getPosition(direction);
        for(int i = 0; i != 4; i++) {
            Assertions.assertEquals(pos[i], position[i]);
        }
    }
}
