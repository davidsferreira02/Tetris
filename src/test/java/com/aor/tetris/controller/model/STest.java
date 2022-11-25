package com.aor.tetris.controller.model;

import com.aor.tetris.model.Forms.Forms;
import com.aor.tetris.model.Forms.O;
import com.aor.tetris.model.Forms.S;
import com.aor.tetris.model.Hero.Position;
import com.aor.tetris.model.direction.Direction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.aor.tetris.model.direction.Direction.*;
import static com.aor.tetris.model.direction.Direction.LEFT;

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
