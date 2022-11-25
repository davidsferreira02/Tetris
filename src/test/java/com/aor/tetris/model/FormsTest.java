package com.aor.tetris.model;

import com.aor.tetris.model.Forms.Forms;
import com.aor.tetris.model.Hero.Position;
import com.aor.tetris.model.direction.Direction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FormsTest {
    private Forms form;
    public Direction direction;
    public String color;
    private Position centralPosition;

    @BeforeEach
    public void setDirection(){
        centralPosition = new Position(10,10);
        direction = Direction.UP;
        color = "green";
        form = new Forms(centralPosition) {
            @Override
            public Position[] getPosition(Direction direction) {
                return new Position[0];
            }
        };
    }

    @Test
    public void FormsTest(){
        Assertions.assertEquals(form.direction, direction);
        Assertions.assertEquals(form.getCentralPosition(), centralPosition);
    }


    @Test
    public void getsTest(){
        Assertions.assertEquals(form.getCentralPosition(), centralPosition);
        Assertions.assertEquals(form.getDirection(), direction);
    }
}
