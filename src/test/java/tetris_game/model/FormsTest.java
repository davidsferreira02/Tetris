package tetris_game.model;

import tetris_game.model.forms.Forms;
import tetris_game.model.forms.L;
import tetris_game.model.hero.Position;
import tetris_game.model.direction.Direction;
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
        color = "WHITE";
        form = new L(centralPosition);
    }

    @Test
    public void FormsTest(){
        Assertions.assertEquals(form.direction, direction);
        Assertions.assertEquals(form.getCentralPosition(), centralPosition);
    }
    @Test
    public void GetColorTest(){
       Assertions.assertEquals("WHITE",form.getColor());
    }
    @Test
    public void SetColorTest(){
        form.setColor("GREEN");
        Assertions.assertEquals("GREEN",form.getColor());
    }

    @Test
    public void GetCentralPositionTest(){

        Assertions.assertEquals(new Position(10,10),form.getCentralPosition());
    }
    @Test
    public void SetCentralPositionTest(){
        Position position=new Position(11,11);
        form.setCentralPosition(position);
        Assertions.assertEquals(position,form.getCentralPosition());
    }

    @Test
    public void GetDirectionTest(){
        Assertions.assertEquals(Direction.UP,form.getDirection());
    }
    @Test
    public void SetDirectionTest(){
        form.setDirection(Direction.DOWN);
        Assertions.assertEquals(Direction.DOWN,form.getDirection());
    }


    @Test
    public void getsTest(){
        Assertions.assertEquals(form.getCentralPosition(), centralPosition);
        Assertions.assertEquals(form.getDirection(), direction);
    }
}
