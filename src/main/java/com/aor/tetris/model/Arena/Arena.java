package com.aor.tetris.model.Arena;

import com.aor.tetris.model.Hero.Position;
import com.aor.tetris.model.Hero.BlockHero;

public class Arena {

    private BlockHero[][] arena;

    public Arena(int width, int height) {
        arena = new BlockHero[height][width];

        for (BlockHero[] v1 : arena) {
            for (BlockHero b : v1) b = null;
        }
    }

    public BlockHero[][] getArena(){
        return arena;
    }
    public boolean canMove(Position[] position){
        boolean BlockcanMove = true;
        for (Position positions : position) {
            if (!BlockcanOccupy(positions)) {
                BlockcanMove = false;
                break;
            }
        }
        return BlockcanMove;
    }

    public boolean BlockcanOccupy(Position pos) {
        if (pos.getX()<0 || pos.getX()>=arena[0].length) return false;
        if (pos.getY()<0 || pos.getY()>=arena.length) return false;
        return arena[pos.getY()][pos.getX()] == null;
    }

    public void addBlock(Position position, BlockHero hero){
        arena[position.getY()][position.getX()] = hero;
    }





}