package com.aor.tetris.model.game;

import com.aor.tetris.model.Position;
import com.aor.tetris.model.game.elements.BlockHero;

public class BlockRestrictions {


    private BlockHero[][] blockHero;
    private int width;
    private int height;


    public BlockRestrictions(int width, int height) {
        blockHero = new BlockHero[width][height];
        this.width = width;
        this.height = height;
    }

    public BlockHero [][] getBlockRestrictions(){
        return blockHero;
    }



    public boolean canGo(Position position) {
        if (position.getX() < 0 || position.getX() >= blockHero[0].length)
            return false;
        if (position.getY() < 0 || position.getY() >= blockHero.length)
            return false;
        return true;
    }

    public boolean canMove(Position[] position) {

        for (Position positions : position) {
            if (!canGo(positions))
                return false;
        }
        return true;
    }

    public boolean LineFull(int number) {
        for (BlockHero Hero : blockHero[number]) {
            if (Hero == null) {
                return false;
            }
        }
        return true;
    }

    public void addBlockHero(BlockHero Hero,Position position){
        blockHero[position.getX()][position.getX()]=Hero;

    }
}
