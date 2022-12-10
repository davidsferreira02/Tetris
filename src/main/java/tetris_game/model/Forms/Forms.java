package tetris_game.model.Forms;

import tetris_game.model.Hero.Position;
import tetris_game.model.direction.Direction;

public abstract class Forms {

    public Direction direction;
    public String color;
    private Position centralPosition;

    public Forms(Position position) {
        this.centralPosition = new Position(position.getX(), position.getY());
        this.direction = Direction.UP;

    }

    public String getColor() {
        return color;
    }

    public abstract Position[] getPosition(Direction direction);
    public Position[] getActualPosition(Position centralPosition, Direction direction) {
        Position[] position = getPosition(direction);
        for (int i = 0; i < 4; i++) {
            position[i] = new Position(position[i].getX() + centralPosition.getX(), position[i].getY() + centralPosition.getY());
        }
        return position;
    }

    public void setDirection(Direction direction){
        this.direction = direction;
    }

    public Position getCentralPosition() {
        return centralPosition;
    }
    public void setCentralPosition(Position position) {
        this.centralPosition=centralPosition;
    }
    public Direction getDirection() {
        return this.direction;
    }

    public Position[] rotateRightPosition() {
        Direction direction = Direction.UP;
        switch (this.direction) {
            case UP:
                direction = Direction.RIGHT;
                break;
            case RIGHT:
                direction = Direction.DOWN;
                break;
            case DOWN:
                direction = Direction.LEFT;
                break;
            case LEFT:
                direction = Direction.UP;
                break;
        }
        return getActualPosition(this.centralPosition, direction);
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


    public Position[] rotateLeftPosition() {
        Direction direction = Direction.UP;
        switch (this.direction) {
            case UP:
                direction = Direction.LEFT;
                break;
            case LEFT:
                direction = Direction.DOWN;
                break;
            case DOWN:
                direction = Direction.RIGHT;
                break;
            case RIGHT:
                direction = Direction.UP;
                break;
        }
        return getActualPosition(this.centralPosition, direction);
    }
    public void moveRight() {
        this.centralPosition = new Position(centralPosition.getX() + 1, centralPosition.getY());
    }

    public Position[] moveRightPosition() {
        return getActualPosition(new Position(centralPosition.getX() + 1, centralPosition.getY()), this.direction);
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



    public void moveLeft() {
        this.centralPosition = new Position(centralPosition.getX() - 1, centralPosition.getY());
    }

    public void moveDown() {
        this.centralPosition = new Position(centralPosition.getX(), centralPosition.getY() + 1);
    }

    public Position[] moveLeftPosition() {
        return getActualPosition(new Position(centralPosition.getX() - 1, centralPosition.getY()), this.direction);
    }

    public Position[] moveDownPosition() {
        return getActualPosition(new Position(centralPosition.getX(), centralPosition.getY() + 1), this.direction);
    }



}
