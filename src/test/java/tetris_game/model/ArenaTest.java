package tetris_game.model;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tetris_game.model.arena.Arena;
import tetris_game.model.hero.BlockHero;
import tetris_game.model.hero.Position;

public class ArenaTest {

    Arena arena;

    @BeforeEach
    void setUp(){
        arena = new Arena(10,10);
    }



    @Test
    void  BlockcanOccupy(){
        BlockHero block = new BlockHero("#FFFFFF");

        if(arena.BlockcanOccupy(new Position(0,4))) arena.addBlock(new Position(0,4),block);
        if(arena.isLineFull(4)) arena.eraseLine(4);
        if(arena.BlockcanOccupy(new Position(1,4))) arena.addBlock(new Position(1,4),block);
        if(arena.BlockcanOccupy(new Position(1,4))) arena.addBlock(new Position(1,4),block);
        if(arena.BlockcanOccupy(new Position(0,3))) arena.addBlock(new Position(0,3),block);
        if(arena.BlockcanOccupy(new Position(1,3))) arena.addBlock(new Position(1,3),block);
        if(arena.BlockcanOccupy(new Position(2,4))) arena.addBlock(new Position(2,4),block);
        if(arena.BlockcanOccupy(new Position(3,4))) arena.addBlock(new Position(3,4),block);
        if(arena.BlockcanOccupy(new Position(4,4))) arena.addBlock(new Position(4,4),block);
        if(arena.isLineFull(4)) arena.eraseLine(4);
        if(arena.BlockcanOccupy(new Position(4,4))) arena.addBlock(new Position(4,4),block);

        Assertions.assertTrue(arena.BlockcanOccupy(new Position(1,3)));
        Assertions.assertTrue(arena.BlockcanOccupy(new Position(0,3)));
        Assertions.assertTrue(arena.BlockcanOccupy(new Position(2,4)));
        Assertions.assertTrue(arena.BlockcanOccupy(new Position(3,4)));
        Assertions.assertFalse(arena.BlockcanOccupy(new Position(0,4)));
        Assertions.assertFalse(arena.BlockcanOccupy(new Position(1,4)));
        Assertions.assertFalse(arena.BlockcanOccupy(new Position(4,4)));

        Assertions.assertFalse(arena.BlockcanOccupy(new Position(-2,0)));
        Assertions.assertFalse(arena.BlockcanOccupy(new Position(0,-2)));
        Assertions.assertFalse(arena.BlockcanOccupy(new Position(10,0)));
        Assertions.assertFalse(arena.BlockcanOccupy(new Position(0,10)));

    }
}
