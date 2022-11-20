package com.aor.tetris.model.game.forms;


import com.aor.tetris.model.Position;
import com.aor.tetris.model.game.direction.Direction;

public class S extends Forms {

    public S(Position position) {
        super(position);
        this.color = "ORANGE";
    }

    public S(Forms tetrimino) {
        super(tetrimino.getCentralPosition());
        this.color = "ORANGE";
    }

    public Position[] getPositions(Direction direction) {
        Position[] position = new Position[4];
        switch (direction) {
            case UP:
                position[0] = new Position(0, 0);
                position[1] = new Position(0, -1);
                position[2] = new Position(1, -1);
                position[3] = new Position(-1, 0);
                break;
            case RIGHT:
                position[0] = new Position(0, 0);
                position[1] = new Position(0, -1);
                position[2] = new Position(1, 0);
                position[3] = new Position(1, 1);
                break;
            case DOWN:
                position[0] = new Position(0, 0);
                position[1] = new Position(0, 1);
                position[2] = new Position(1, 0);
                position[3] = new Position(-1, 1);
                break;
            case LEFT:
                position[0] = new Position(0, 0);
                position[1] = new Position(0, 1);
                position[2] = new Position(-1, 0);
                position[3] = new Position(-1, -1);
                break;
        }
        return position;
    }
}
