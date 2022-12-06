package tetris_game.controller.model;

import tetris_game.model.Forms.Forms;
import tetris_game.model.Forms.J;
import tetris_game.model.Hero.Position;
import tetris_game.model.direction.Direction;
import org.junit.jupiter.api.BeforeEach;

public class JTest {
    private Direction direction;
    private Position[] position;
    private Forms J;

    @BeforeEach
    public void setPosition(){
        position = new Position[4];
        J = new J(new Position(10,1));
    }
/*
    @Test
    public void JUpTest(){
        direction = UP;
        position[0] = new Position(0, 0);
        position[1] = new Position(-1, 0);
        position[2] = new Position(-1, -1);
        position[3] = new Position(1, 0);
        Assertions.assertEquals(J.getPosition(direction), position);
    }

    @Test
    public void JDownTest(){
        direction = DOWN;
        position[0] = new Position(0, 0);
        position[1] = new Position(1, 0);
        position[2] = new Position(1, 1);
        position[3] = new Position(-1, 0);
        Assertions.assertEquals(J.getPosition(direction), position);
    }

    @Test
    public void JRightTest(){
        direction = RIGHT;
        position[0] = new Position(0, 0);
        position[1] = new Position(0, -1);
        position[2] = new Position(1, -1);
        position[3] = new Position(0, 1);
        Assertions.assertEquals(J.getPosition(direction), position);
    }

    @Test
    public void JLeftTest(){
        direction = LEFT;
        position[0] = new Position(0, 0);
        position[1] = new Position(0, 1);
        position[2] = new Position(0, -1);
        position[3] = new Position(-1, 1);
        Assertions.assertEquals(J.getPosition(direction), position);
    }

 */
}
