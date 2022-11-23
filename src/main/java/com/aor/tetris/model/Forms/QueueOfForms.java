package com.aor.tetris.model.Forms;

import com.aor.tetris.model.Hero.Position;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Random;

public class QueueOfForms {

    private Queue<Forms> FormsQueue;

    public QueueOfForms() {
        FormsQueue = new ArrayDeque<>();
        for(int i = 0; i < 3; i++) FormsQueue.add(generateLast());
    }

    public Forms popNext() {
        FormsQueue.add(generateLast());
        return FormsQueue.remove();
    }
    private Forms generateLast() {
        Random random = new Random();
        int num = random.nextInt(7);
        Forms next = new Z(new Position(10,1));

        switch (num){
            case 0:
                next = new I(new Position(10,0));
                break;
            case 1:
                next = new J(new Position(10,1));
                break;
            case 2:
                next = new L(new Position(10,1));
                break;
            case 3:
                next = new O(new Position(10,1));
                break;
            case 4:
                next = new S(new Position(10,1));
                break;
            case 5:
                next = new T(new Position(10,1));
                break;
        }

        return next;
    }
}
