package com.aor.tetris.model.Forms;

import com.aor.tetris.model.Hero.Position;
import com.aor.tetris.model.direction.Direction;

public class S extends Forms {

    public S(Position position) {
        super(position);
        this.color = "GREEN";
    }


    public Position[] getPositions(Direction direction) {
        Position[] positions = new Position[4];
        switch (direction) {
            case UP:
                positions[0] = new Position(0, 0);
                positions[1] = new Position(0, -1);
                positions[2] = new Position(1, -1);
                positions[3] = new Position(-1, 0);
                break;
            case RIGHT:
                positions[0] = new Position(0, 0);
                positions[1] = new Position(0, -1);
                positions[2] = new Position(1, 0);
                positions[3] = new Position(1, 1);
                break;
            case DOWN:
                positions[0] = new Position(0, 0);
                positions[1] = new Position(0, 1);
                positions[2] = new Position(1, 0);
                positions[3] = new Position(-1, 1);
                break;
            case LEFT:
                positions[0] = new Position(0, 0);
                positions[1] = new Position(0, 1);
                positions[2] = new Position(-1, 0);
                positions[3] = new Position(-1, -1);
                break;
        }
        return positions;
    }
}
