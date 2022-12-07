package tetris_game.model.Forms;

import tetris_game.model.Hero.Position;
import tetris_game.model.direction.Direction;

public class I extends Forms {

    public I(Position position) {
        super(position);
        this.color = "BLUE";
    }


    public Position[] getPosition(Direction direction) {
        Position[] position = new Position[4];
        switch (direction) {
            case UP:
                position[0] = new Position(0, 0);
                position[1] = new Position(-1, 0);
                position[2] = new Position(1, 0);
                position[3] = new Position(-2, 0);
                break;
            case DOWN:
                position[0] = new Position(-1, -1);
                position[1] = new Position(0, -1);
                position[2] = new Position(1, -1);
                position[3] = new Position(-2, -1);
                break;

            case LEFT:
                position[0] = new Position(0, 0);
                position[1] = new Position(0, -1);
                position[2] = new Position(0, -2);
                position[3] = new Position(0, 1);
                break;

            case RIGHT:
                position[0] = new Position(-1, 0);
                position[1] = new Position(-1, -1);
                position[2] = new Position(-1, -2);
                position[3] = new Position(-1, 1);
        }
        return position;
    }
}