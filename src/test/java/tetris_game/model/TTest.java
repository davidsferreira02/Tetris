package tetris_game.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tetris_game.model.Forms.Forms;
import tetris_game.model.Forms.T;
import tetris_game.model.Hero.Position;
import tetris_game.model.direction.Direction;
import org.junit.jupiter.api.BeforeEach;

import static tetris_game.model.direction.Direction.*;

public class TTest {
    private Direction direction;
    private Position[] position;
    private Forms T;

    @BeforeEach
    public void setPosition(){
        position = new Position[4];
        T = new T(new Position(10,1));
    }

    @Test
    public void TUpTest(){
        direction = UP;
        position[0] = new Position(0, 0);
        position[1] = new Position(-1, 0);
        position[2] = new Position(0, -1);
        position[3] = new Position(1, 0);
        Position[] pos =  T.getPosition(direction);
        for(int i = 0; i != 4; i++) {
            Assertions.assertEquals(pos[i], position[i]);
        }
    }

    @Test
    public void TDownTest(){
        direction = DOWN;
        position[0] = new Position(0, 0);
        position[1] = new Position(1, 0);
        position[2] = new Position(0, 1);
        position[3] = new Position(-1, 0);
        Position[] pos =  T.getPosition(direction);
        for(int i = 0; i != 4; i++) {
            Assertions.assertEquals(pos[i], position[i]);
        }
    }

    @Test
    public void TRightTest(){
        direction = RIGHT;
        position[0] = new Position(0, 0);
        position[1] = new Position(1, 0);
        position[2] = new Position(0, 1);
        position[3] = new Position(0, -1);
        Position[] pos =  T.getPosition(direction);
        for(int i = 0; i != 4; i++) {
            Assertions.assertEquals(pos[i], position[i]);
        }
    }

    @Test
    public void TLeftTest(){
        direction = LEFT;
        position[0] = new Position(0, 0);
        position[1] = new Position(-1, 0);
        position[2] = new Position(0, -1);
        position[3] = new Position(0, 1);
        Position[] pos =  T.getPosition(direction);
        for(int i = 0; i != 4; i++) {
            Assertions.assertEquals(pos[i], position[i]);
        }
    }
}
