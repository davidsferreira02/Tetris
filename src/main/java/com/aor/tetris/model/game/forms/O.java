package com.aor.tetris.model.game.forms;

import com.aor.tetris.model.Position;
import com.aor.tetris.model.game.arena.Screen;
import com.aor.tetris.model.game.direction.Direction;

public class O extends Screen {

    public O(Position position) {
        super(position);
        this.color = "CYAN";
    }

    public O(Screen tetrimino) {
        super(tetrimino.getCentralPosition());
        this.color = "CYAN";
    }

    public Position[] getPositions(Direction direction) {
        Position[] position = new Position[4];
        switch (direction) {
            case UP: case LEFT: case DOWN: case RIGHT:
                position[0] = new Position(0, 0);
                position[1] = new Position(-1, 0);
                position[2] = new Position(0, -1);
                position[3] = new Position(-1, -1);
                break;
        }
        return position;
    }
}