package com.aor.tetris.model.game.Forms;

import com.aor.tetris.model.Position;
import com.aor.tetris.model.game.Direction;

public class O extends Forms {

    public O(Position position) {
        super(position);
        this.color = "YELLOW";
    }


    public Position[] getPositions(Direction direction) {
        Position[] positions = new Position[4];
        switch (direction) {
            case UP: case LEFT: case DOWN: case RIGHT:
                positions[0] = new Position(0, 0);
                positions[1] = new Position(-1, 0);
                positions[2] = new Position(0, -1);
                positions[3] = new Position(-1, -1);
                break;
        }
        return positions;
    }
}
