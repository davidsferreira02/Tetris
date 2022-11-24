package com.aor.tetris.model;

import com.aor.tetris.model.Forms.Forms;
import com.aor.tetris.model.Forms.I;
import com.aor.tetris.model.Forms.L;
import com.aor.tetris.model.Forms.O;
import com.aor.tetris.model.Hero.Position;
import com.aor.tetris.model.direction.Direction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.aor.tetris.model.direction.Direction.*;
import static com.aor.tetris.model.direction.Direction.LEFT;

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
        Assertions.assertEquals(O.getPosition(direction), position);
    }

    @Test
    public void ODownTest(){
        direction = DOWN;
        position[0] = new Position(0, 0);
        position[2] = new Position(0, -1);
        position[1] = new Position(-1, 0);
        position[3] = new Position(-1, -1);
        Assertions.assertEquals(O.getPosition(direction), position);
    }

    @Test
    public void ORightTest(){
        direction = RIGHT;
        position[0] = new Position(0, 0);
        position[2] = new Position(0, -1);
        position[1] = new Position(-1, 0);
        position[3] = new Position(-1, -1);
        Assertions.assertEquals(O.getPosition(direction), position);
    }

    @Test
    public void OLeftTest(){
        direction = LEFT;
        position[0] = new Position(0, 0);
        position[2] = new Position(0, -1);
        position[1] = new Position(-1, 0);
        position[3] = new Position(-1, -1);
        Assertions.assertEquals(O.getPosition(direction), position);
    }
}
