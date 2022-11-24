package com.aor.tetris.model;

import com.aor.tetris.model.Forms.Forms;
import com.aor.tetris.model.Forms.I;
import com.aor.tetris.model.Forms.J;
import com.aor.tetris.model.Hero.Position;
import com.aor.tetris.model.direction.Direction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.aor.tetris.model.direction.Direction.*;
import static com.aor.tetris.model.direction.Direction.LEFT;
/*
public class JTest {
    private Direction direction;
    private Position[] position;

    @BeforeEach
    public void setPosition(){
        position = new Position[4];
        Forms J = new J(new Position(10,1));
    }

    @Test
    public void JUpTest(){
        direction = UP;
        position[0] = new Position(0, 0);
        position[1] = new Position(-1, 0);
        position[2] = new Position(-1, -1);
        position[3] = new Position(1, 0);
        Assertions.assertEquals(I.getPosition(direction), position);
    }

    @Test
    public void JDownTest(){
        direction = DOWN;
        position[0] = new Position(0, 0);
        position[1] = new Position(1, 0);
        position[2] = new Position(1, 1);
        position[3] = new Position(-1, 0);
        Assertions.assertEquals(I.getPosition(direction), position);
    }

    @Test
    public void JRightTest(){
        direction = RIGHT;
        position[0] = new Position(0, 0);
        position[1] = new Position(0, -1);
        position[2] = new Position(1, -1);
        position[3] = new Position(0, 1);
        Assertions.assertEquals(I.getPosition(direction), position);
    }

    @Test
    public void JLeftTest(){
        direction = LEFT;
        position[0] = new Position(0, 0);
        position[1] = new Position(0, 1);
        position[2] = new Position(0, -1);
        position[3] = new Position(-1, 1);
        Assertions.assertEquals(I.getPosition(direction), position);
    }
}
*/