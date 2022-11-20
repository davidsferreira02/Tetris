package com.aor.tetris.model.game.forms;

import com.aor.tetris.model.Position;
import com.aor.tetris.model.game.direction.Direction;

public abstract class Forms {

    protected Direction direction;
    private Position centralPosition;
    protected String color;

    public Forms(Position position) {

        this.direction = Direction.UP;
        this.centralPosition = new Position(position.getX(), position.getY());

    }

    public Forms copy() {
        Forms t = new I(this.centralPosition);
        if (this instanceof J) t = new J(this.centralPosition);
        else if (this instanceof L) t = new L(this.centralPosition);
        else if (this instanceof O) t = new O(this.centralPosition);
        else if (this instanceof S) t = new S(this.centralPosition);
        else if (this instanceof T) t = new T(this.centralPosition);
        else if (this instanceof Z) t = new Z(this.centralPosition);

        t.setDirection(this.direction);

        return t;
    }

    public String getColor() {
        return color;
    }

    public abstract Position[] getPositions(Direction direction);

    public Position getCentralPosition() {
        return centralPosition;
    }

    public void setCentralPosition(Position position) {
        this.centralPosition = position;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Direction getDirection() {
        return this.direction;
    }

    public Position[] rotateRightPositions() {
        Direction tempdirection = Direction.UP;
        switch (this.direction) {
            case UP:
                tempdirection = Direction.RIGHT;
                break;
            case RIGHT:
                tempdirection = Direction.DOWN;
                break;
            case DOWN:
                tempdirection = Direction.LEFT;
                break;
            case LEFT:
                tempdirection = Direction.UP;
                break;
        }
        return getActualPositions(this.centralPosition, tempdirection);
    }

    public void rotateRight() {
        switch (this.direction) {
            case UP:
                this.direction = Direction.RIGHT;
                break;
            case RIGHT:
                this.direction = Direction.DOWN;
                break;
            case DOWN:
                this.direction = Direction.LEFT;
                break;
            case LEFT:
                this.direction = Direction.UP;
                break;
        }
    }


    public Position[] rotateLeftPositions() {
      Direction tempdirection = Direction.UP;
        switch (this.direction) {
            case UP:
                tempdirection = Direction.LEFT;
                break;
            case LEFT:
                tempdirection = Direction.DOWN;
                break;
            case DOWN:
                tempdirection = Direction.RIGHT;
                break;
            case RIGHT:
                tempdirection = Direction.UP;
                break;
        }
        return getActualPositions(this.centralPosition, tempdirection);
    }

    public void rotateLeft() {
        switch (this.direction) {
            case UP:
                this.direction = Direction.LEFT;
                break;
            case LEFT:
                this.direction = Direction.DOWN;
                break;
            case DOWN:
                this.direction = Direction.RIGHT;
                break;
            case RIGHT:
                this.direction = Direction.UP;
                break;
        }
    }

    public void moveRight() {
        this.centralPosition = new Position(centralPosition.getX() + 1, centralPosition.getY());
    }

    public void moveLeft() {
        this.centralPosition = new Position(centralPosition.getX() - 1, centralPosition.getY());
    }

    public void moveDown() {
        this.centralPosition = new Position(centralPosition.getX(), centralPosition.getY() + 1);
    }

    public Position[] moveRightPositions() {
        return getActualPositions(new Position(centralPosition.getX() + 1, centralPosition.getY()), this.direction);
    }

    public Position[] moveLeftPositions() {
        return getActualPositions(new Position(centralPosition.getX() - 1, centralPosition.getY()), this.direction);
    }

    public Position[] moveDownPositions() {
        return getActualPositions(new Position(centralPosition.getX(), centralPosition.getY() + 1), this.direction);
    }

    public Position[] getActualPositions(Position centralPosition, Direction direction) {
        Position[] positions = getPositions(direction);
        for (int i = 0; i < 4; i++) {
            positions[i] = new Position(positions[i].getX() + centralPosition.getX(), positions[i].getY() + centralPosition.getY());
        }
        return positions;
    }
}
