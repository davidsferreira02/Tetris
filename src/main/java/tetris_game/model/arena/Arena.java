package tetris_game.model.arena;

import tetris_game.model.hero.Position;
import tetris_game.model.hero.BlockHero;

import java.util.Arrays;

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

    public boolean isLineFull(int line){
        boolean full = true;

        for (BlockHero block : arena[line]){
            if (block == null) {
                full = false;
                break;
            }
        }

        return full;
    }

    public void addBlock(Position position, BlockHero hero){
        arena[position.getY()][position.getX()] = hero;
    }

    public void eraseLine(int line){
        for (int i = line; i > 0; i--){
            System.arraycopy(arena[i - 1], 0, arena[i], 0, arena[0].length);
        }
        Arrays.fill(arena[0], null);
    }

}