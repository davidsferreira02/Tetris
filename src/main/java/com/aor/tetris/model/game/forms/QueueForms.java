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
        Forms next = new Z(new Position(5,1));

        switch (num){
            case 0:
                next = new I(new Position(5,0));
                break;
            case 1:
                next = new J(new Position(5,1));
                break;
            case 2:
                next = new L(new Position(5,1));
                break;
            case 3:
                next = new O(new Position(5,1));
                break;
            case 4:
                next = new S(new Position(5,1));
                break;
            case 5:
                next = new T(new Position(5,1));
                break;
        }

        return next;
    }
}
