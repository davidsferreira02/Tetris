package com.aor.tetris.model.game.forms;


import com.aor.tetris.model.Position;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Random;

public class QueueForms{

    private Queue<Forms> Queue;

    public QueueForms() {
        Queue = new ArrayDeque<>();
        for(int i = 0; i < 3; i++) Queue.add(generateLast());
    }

    public Forms popNext() {
        Queue.add(generateLast());
        return  Queue.remove();
    }

    public ArrayList<Forms> getFormsQueue() {
        return new ArrayList(Queue);
    }

    private Forms generateLast() {
        Random random = new Random();
        int num = random.nextInt(7);
        Forms nextBlock = new Z(new Position(7,1));

        switch (num){
            case 0:
                nextBlock = new I(new Position(7,0));
                break;
            case 1:
                nextBlock = new J(new Position(7,1));
                break;
            case 2:
                nextBlock = new L(new Position(7,1));
                break;
            case 3:
                nextBlock = new O(new Position(7,1));
                break;
            case 4:
                nextBlock = new S(new Position(7,1));
                break;
            case 5:
                nextBlock = new T(new Position(7,1));
                break;
        }

        return nextBlock;
    }
}
