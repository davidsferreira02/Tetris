package com.aor.tetris.model;


import com.aor.tetris.model.Forms.Forms;
import com.aor.tetris.model.Forms.I;
import com.aor.tetris.model.Hero.Position;
import com.aor.tetris.model.direction.Direction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.aor.tetris.model.direction.Direction.UP;
import static com.aor.tetris.model.direction.Direction.DOWN;
import static com.aor.tetris.model.direction.Direction.RIGHT;
import static com.aor.tetris.model.direction.Direction.LEFT;
/*
public class ITest {
    private Direction direction;
    private Position[] position;

    @BeforeEach
    public void setPosition(){
        position = new Position[4];
        Forms I = new I(new Position(10,0));
    }

    @Test
    public void IUpTest(){
        direction = UP;
        position[0] = new Position(0, 0);
        position[1] = new Position(-1, 0);
        position[2] = new Position(1, 0);
        position[3] = new Position(-2, 0);
        Assertions.assertEquals(I.getPosition(direction), position);
    }

    @Test
    public void IDownTest(){
        direction = DOWN;
        position[0] = new Position(-1, -1);
        position[1] = new Position(0, -1);
        position[2] = new Position(1, -1);
        position[3] = new Position(-2, -1);
        Assertions.assertEquals(I.getPosition(direction), position);
    }

    @Test
    public void IRightTest(){
        direction = RIGHT;
        position[0] = new Position(-1, 0);
        position[1] = new Position(-1, -1);
        position[2] = new Position(-1, -2);
        position[3] = new Position(-1, 1);
        Assertions.assertEquals(I.getPosition(direction), position);
    }

    @Test
    public void ILeftTest(){
        direction = LEFT;
        position[0] = new Position(0, 0);
        position[1] = new Position(0, -1);
        position[2] = new Position(0, -2);
        position[3] = new Position(0, 1);
        Assertions.assertEquals(I.getPosition(direction), position);
    }
}
*/