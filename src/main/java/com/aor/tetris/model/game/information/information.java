package com.aor.tetris.model.game.information;

public class information {

    private int points;
    private int level;
    private int lines;
    public information(){
        lines=0;
        points=0;
        level=0;
    }
    public int getLevel(){
        return level;
    }
    public int getLine(){
        return lines;
    }
    public int getPoints(){
        return points;
    }

    public void removeBlockLine(int line){
        lines=lines+line;
        if(line==1){
            points=points +(5*level);
        }
        else if(line==2){
            points=points +(10*level);
        }
        else if(line==3){
            points=points +(15*level);
        }
        if(lines - level*5>=0){
            level++;
        }
    }
}
