package com.aor.tetris.model.game.Forms;

import com.aor.tetris.model.Position;
import com.aor.tetris.model.game.Direction;

public abstract class Forms {

    protected Direction direction;
    private Position centralPosition;
    protected  String color;

    public Forms(Position position){

        this.direction = Direction.UP;
        this.centralPosition = new Position(position.getX(), position.getY());

    }

    public Forms copy() {
        Forms forms = new I(this.centralPosition);
        if(this instanceof J) forms = new J(this.centralPosition);
        else if(this instanceof L) forms = new L(this.centralPosition);
        else if(this instanceof O) forms= new O(this.centralPosition);
        else if(this instanceof S) forms = new S(this.centralPosition);
        else if(this instanceof T) forms = new T(this.centralPosition);
        else if(this instanceof Z) forms = new Z(this.centralPosition);

        forms.setDirection(this.direction);

        return forms;
    }

    public String getColor() {
        return color;
    }

    public abstract Position[] getPositions(Direction direction);

    public Position getCentralPosition(){return centralPosition;}



    public void setDirection(Direction direction){
        this.direction = direction;
    }

    public Direction getDirection(){return this.direction;}

    public Position[]  rotateRightPositions(){
        Direction tempdirection = Direction.UP;
        switch(this.direction){
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
        return getActualPosition(this.centralPosition,tempdirection);
    }

    public void  rotateRight(){
        switch(this.direction){
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


    public Position[] rotateLeftPositions(){
        Direction direction = Direction.UP;
        switch(this.direction) {
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
        return getActualPosition(this.centralPosition,direction);
    }

    public void rotateLeft(){
        switch(this.direction) {
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

    public void moveRight(){
        this.centralPosition = new Position(centralPosition.getX()+1, centralPosition.getY() );
    }
    public void moveLeft(){
        this.centralPosition = new Position(centralPosition.getX()-1, centralPosition.getY() );
    }
    public void moveDown(){
        this.centralPosition = new Position(centralPosition.getX(), centralPosition.getY()+1);
    }
    public Position[] moveRightPosition(){
        return getActualPosition( new Position(centralPosition.getX()+1, centralPosition.getY() ),this.direction);
    }
    public Position[] moveLeftPosition(){
        return getActualPosition( new Position(centralPosition.getX()-1, centralPosition.getY() ),this.direction);
    }
    public Position[] moveDownPosition(){
        return getActualPosition(new Position(centralPosition.getX(), centralPosition.getY()+1),this.direction);
    }

    public Position[] getActualPosition(Position centralPosition, Direction direction){
        Position[] position = getPositions(direction);
        for(int i = 0; i < 4;i++){
            position[i] = new Position(position[i].getX()+centralPosition.getX(),position[i].getY()+centralPosition.getY());
        }
        return position;
    }


}
