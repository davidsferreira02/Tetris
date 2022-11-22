package com.aor.tetris.model.Arena;

import com.aor.tetris.model.Position;
import com.aor.tetris.model.game.BlockHero;

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

    public boolean canOccupy(Position pos) {
        if (pos.getX()<0 || pos.getX()>=arena[0].length) return false;
        if (pos.getY()<0 || pos.getY()>=arena.length) return false;
        return arena[pos.getY()][pos.getX()] == null;
    }



    public boolean canMove(Position[] positions){
        boolean canMove = true;
        for (Position p : positions) {
            if (!canOccupy(p)) {
                canMove = false;
                break;
            }
        }
        return canMove;
    }

    public void addBlock(Position pos, BlockHero hero){
        arena[pos.getY()][pos.getX()] = hero;
    }

}