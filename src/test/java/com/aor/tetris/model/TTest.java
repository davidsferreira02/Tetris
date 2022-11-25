package com.aor.tetris.model;

import com.aor.tetris.model.Forms.Forms;
import com.aor.tetris.model.Forms.S;
import com.aor.tetris.model.Forms.T;
import com.aor.tetris.model.Hero.Position;
import com.aor.tetris.model.direction.Direction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.aor.tetris.model.direction.Direction.*;
import static com.aor.tetris.model.direction.Direction.LEFT;

public class TTest {
    private Direction direction;
    private Position[] position;
    private Forms T;

    @BeforeEach
    public void setPosition(){
        position = new Position[4];
        T = new T(new Position(10,1));
    }
/*
    @Test
    public void TUpTest(){
        direction = UP;
        position[0] = new Position(0, 0);
        position[1] = new Position(-1, 0);
        position[2] = new Position(0, -1);
        position[3] = new Position(1, 0);
        Assertions.assertEquals(T.getPosition(direction), position);
    }

    @Test
    public void TDownTest(){
        direction = DOWN;
        position[0] = new Position(0, 0);
        position[1] = new Position(1, 0);
        position[2] = new Position(0, 1);
        position[3] = new Position(-1, 0);
        Assertions.assertEquals(T.getPosition(direction), position);
    }

    @Test
    public void TRightTest(){
        direction = RIGHT;
        position[0] = new Position(0, 0);
        position[1] = new Position(1, 0);
        position[2] = new Position(0, 1);
        position[3] = new Position(0, -1);
        Assertions.assertEquals(T.getPosition(direction), position);
    }

    @Test
    public void TLeftTest(){
        direction = LEFT;
        position[0] = new Position(0, 0);
        position[1] = new Position(-1, 0);
        position[2] = new Position(0, -1);
        position[3] = new Position(0, 1);
        Assertions.assertEquals(T.getPosition(direction), position);
    }

 */
}
