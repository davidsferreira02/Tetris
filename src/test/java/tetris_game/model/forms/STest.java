package tetris_game.model.forms;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tetris_game.model.forms.Forms;
import tetris_game.model.forms.S;
import tetris_game.model.hero.Position;
import tetris_game.model.direction.Direction;
import org.junit.jupiter.api.BeforeEach;

import static tetris_game.model.direction.Direction.*;

public class STest {
    private Direction direction;
    private Position[] position;
    private Forms S;

    @BeforeEach
    public void setPosition(){
        position = new Position[4];
        S = new S(new Position(10,1));
    }
    @AfterEach
    void after(){
        position=null;
        S=null;
    }

    @Test
    public void SUpTest(){
        direction = UP;
        position[0] = new Position(0, 0);
        position[1] = new Position(0, -1);
        position[2] = new Position(1, -1);
        position[3] = new Position(-1, 0);
        Position[] pos =  S.getPosition(direction);
        for(int i = 0; i != 4; i++) {
            Assertions.assertEquals(pos[i], position[i]);
        }
    }

    @Test
    public void SDownTest(){
        direction = DOWN;
        position[0] = new Position(0, 0);
        position[1] = new Position(0, 1);
        position[2] = new Position(1, 0);
        position[3] = new Position(-1, 1);
        Position[] pos =  S.getPosition(direction);
        for(int i = 0; i != 4; i++) {
            Assertions.assertEquals(pos[i], position[i]);
        }
    }

    @Test
    public void SRightTest(){
        direction = RIGHT;
        position[0] = new Position(0, 0);
        position[1] = new Position(0, -1);
        position[2] = new Position(1, 0);
        position[3] = new Position(1, 1);
        Position[] pos =  S.getPosition(direction);
        for(int i = 0; i != 4; i++) {
            Assertions.assertEquals(pos[i], position[i]);
        }
    }

    @Test
    public void SLeftTest(){
        direction = LEFT;
        position[0] = new Position(0, 0);
        position[1] = new Position(0, 1);
        position[2] = new Position(-1, 0);
        position[3] = new Position(-1, -1);
        Position[] pos =  S.getPosition(direction);
        for(int i = 0; i != 4; i++) {
            Assertions.assertEquals(pos[i], position[i]);
        }
    }
}
