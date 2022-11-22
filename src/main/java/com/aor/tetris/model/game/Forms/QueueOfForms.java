package com.aor.tetris.model.game.Forms;

import com.aor.tetris.model.Position;

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

    public ArrayList<Forms> getFormsQueue() {
        return new ArrayList(FormsQueue);
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
