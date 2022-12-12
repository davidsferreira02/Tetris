package tetris_game.model;


import tetris_game.model.hero.BlockHero;
import tetris_game.model.arena.Arena;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tetris_game.model.hero.Position;

public class ArenaTest {


        Arena board;

        @BeforeEach
        void setUp(){
            board = new Arena(5,5);
        }

        @AfterEach
        void after(){
            board = null;
        }

        @Test
        void  BlockcanOccupy(){
            BlockHero b = new BlockHero("#FFFFFF");

            if(board.BlockcanOccupy(new Position(0,4))) board.addBlock(new Position(0,4),b);
            if(board.isLineFull(4)) board.eraseLine(4);
            if(board.BlockcanOccupy(new Position(1,4))) board.addBlock(new Position(1,4),b);
            if(board.BlockcanOccupy(new Position(1,4))) board.addBlock(new Position(1,4),b);
            if(board.BlockcanOccupy(new Position(0,3))) board.addBlock(new Position(0,3),b);
            if(board.BlockcanOccupy(new Position(1,3))) board.addBlock(new Position(1,3),b);
            if(board.BlockcanOccupy(new Position(2,4))) board.addBlock(new Position(2,4),b);
            if(board.BlockcanOccupy(new Position(3,4))) board.addBlock(new Position(3,4),b);
            if(board.BlockcanOccupy(new Position(4,4))) board.addBlock(new Position(4,4),b);
            if(board.isLineFull(4)) board.eraseLine(4);
            if(board.BlockcanOccupy(new Position(4,4))) board.addBlock(new Position(4,4),b);

            Assertions.assertTrue(board.BlockcanOccupy(new Position(1,3)));
            Assertions.assertTrue(board.BlockcanOccupy(new Position(0,3)));
            Assertions.assertTrue(board.BlockcanOccupy(new Position(2,4)));
            Assertions.assertTrue(board.BlockcanOccupy(new Position(3,4)));
            Assertions.assertFalse(board.BlockcanOccupy(new Position(0,4)));
            Assertions.assertFalse(board.BlockcanOccupy(new Position(1,4)));
            Assertions.assertFalse(board.BlockcanOccupy(new Position(4,4)));

            Assertions.assertFalse(board.BlockcanOccupy(new Position(-1,0)));
            Assertions.assertFalse(board.BlockcanOccupy(new Position(0,-1)));
            Assertions.assertFalse(board.BlockcanOccupy(new Position(5,0)));
            Assertions.assertFalse(board.BlockcanOccupy(new Position(0,5)));

        }
    }

