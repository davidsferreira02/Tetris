package tetris_game.controller.model;

import tetris_game.model.Forms.Forms;
import tetris_game.model.Forms.S;
import tetris_game.model.Hero.Position;
import tetris_game.model.direction.Direction;
import org.junit.jupiter.api.BeforeEach;

public class STest {
    private Direction direction;
    private Position[] position;
    private Forms S;

    @BeforeEach
    public void setPosition(){
        position = new Position[4];
        S = new S(new Position(10,1));
    }
/*
    @Test
    public void SUpTest(){
        direction = UP;
        position[0] = new Position(0, 0);
        position[1] = new Position(0, -1);
        position[2] = new Position(1, -1);
        position[3] = new Position(-1, 0);
        Assertions.assertEquals(S.getPosition(direction), position);
    }

    @Test
    public void SDownTest(){
        direction = DOWN;
        position[0] = new Position(0, 0);
        position[1] = new Position(0, 1);
        position[2] = new Position(1, 0);
        position[3] = new Position(-1, 1);
        Assertions.assertEquals(S.getPosition(direction), position);
    }

    @Test
    public void SRightTest(){
        direction = RIGHT;
        position[0] = new Position(0, 0);
        position[1] = new Position(0, -1);
        position[2] = new Position(1, 0);
        position[3] = new Position(1, 1);
        Assertions.assertEquals(S.getPosition(direction), position);
    }

    @Test
    public void SLeftTest(){
        direction = LEFT;
        position[0] = new Position(0, 0);
        position[1] = new Position(0, 1);
        position[2] = new Position(-1, 0);
        position[3] = new Position(-1, -1);
        Assertions.assertEquals(S.getPosition(direction), position);
    }

 */
}
