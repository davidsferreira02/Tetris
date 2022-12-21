package tetris_game.model.hero;

import java.util.Objects;

public class Position {
    private final int x;
    private final int y;


    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

@Override
    public boolean equals(Object obj) {
    if (!(obj instanceof Position)) {
        return false;
    } else {
        final Position position = (Position) obj;
        return (this.x == position.getX() && this.y == position.getY());
    }
}

    @Override
    public int hashCode() {
        return Objects.hash(x,y);
    }
}