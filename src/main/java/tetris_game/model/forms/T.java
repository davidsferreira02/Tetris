package tetris_game.model.forms;

import tetris_game.model.hero.Position;
import tetris_game.model.direction.Direction;

public class T extends Forms {

    public T(Position position) {
        super(position);
        this.color = "PURPLE";
    }
@Override
    public Position[] getPosition(Direction direction) {
        Position[] position = new Position[4];
        switch (direction) {
            case UP:
                position[0] = new Position(0, 0);
                position[1] = new Position(-1, 0);
                position[2] = new Position(0, -1);
                position[3] = new Position(1, 0);
                break;
            case DOWN:
                position[0] = new Position(0, 0);
                position[1] = new Position(1, 0);
                position[2] = new Position(0, 1);
                position[3] = new Position(-1, 0);
                break;
            case LEFT:
                position[0] = new Position(0, 0);
                position[1] = new Position(-1, 0);
                position[2] = new Position(0, -1);
                position[3] = new Position(0, 1);
                break;
            case RIGHT:
                position[0] = new Position(0, 0);
                position[1] = new Position(1, 0);
                position[2] = new Position(0, 1);
                position[3] = new Position(0, -1);
                break;
        }
        return position;
    }
}
