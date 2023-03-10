package tetris_game.model.forms;

import tetris_game.model.hero.Position;
import tetris_game.model.direction.Direction;

public class J extends Forms {


    public J(Position position) {
        super(position);
        this.color = "ORANGE";
    }

    @Override

    public Position[] getPosition(Direction direction){
        Position[] positions = new Position[4];
        switch (direction) {
            case UP:
                positions[0] = new Position(0, 0);
                positions[1] = new Position(-1, 0);
                positions[2] = new Position(-1, -1);
                positions[3] = new Position(1, 0);
                break;
            case DOWN:
                positions[0] = new Position(0, 0);
                positions[1] = new Position(1, 0);
                positions[2] = new Position(1, 1);
                positions[3] = new Position(-1, 0);
                break;
            case LEFT:
                positions[0] = new Position(0, 0);
                positions[1] = new Position(0, 1);
                positions[2] = new Position(0, -1);
                positions[3] = new Position(-1, 1);
                break;
        case RIGHT:
                positions[0] = new Position(0, 0);
                positions[1] = new Position(0, -1);
                positions[2] = new Position(1, -1);
                positions[3] = new Position(0, 1);
                break;
        }
        return positions;
    }
}
