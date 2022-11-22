package com.aor.tetris.model.game.Forms;

import com.aor.tetris.model.Position;
import com.aor.tetris.model.game.Direction;

public class J extends Forms {


    public J(Position position) {
        super(position);
        this.color = "ORANGE";
    }



    public Position[] getPositions(Direction direction){
        Position[] positions = new Position[4];
        switch (direction) {
            case UP:
                positions[0] = new Position(0, 0);
                positions[1] = new Position(-1, 0);
                positions[2] = new Position(-1, -1);
                positions[3] = new Position(1, 0);
                break;
        case RIGHT:
                positions[0] = new Position(0, 0);
                positions[1] = new Position(0, -1);
                positions[2] = new Position(1, -1);
                positions[3] = new Position(0, 1);
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
        }
        return positions;
    }
}
