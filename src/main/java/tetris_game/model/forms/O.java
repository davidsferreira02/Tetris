package tetris_game.model.forms;

import tetris_game.model.hero.Position;
import tetris_game.model.direction.Direction;

public class O extends Forms {

    public O(Position position) {
        super(position);
        this.color = "YELLOW";
    }

    @Override
    public Position[] getPosition(Direction direction) {
        Position[] position = new Position[4];
        switch (direction) {
            case UP: case LEFT: case DOWN: case RIGHT:
                position[0] = new Position(0, 0);
                position[2] = new Position(0, -1);
                position[1] = new Position(-1, 0);
                position[3] = new Position(-1, -1);
                break;
        }
        return position;
    }
}
