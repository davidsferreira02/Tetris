package com.aor.tetris.model.Forms;


import com.aor.tetris.model.Hero.Position;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Random;

public class QueueOfForms {

    //private Queue<Forms> FormsQueue;
    private ArrayDeque<Forms> FormsQueue;
    private Forms last;


    public QueueOfForms() {
        FormsQueue = new ArrayDeque<>();
        for(int i = 0; i < 3; i++) FormsQueue.add(generateLast());
    }

    public Forms popNext() {
        FormsQueue.add(generateLast());
        last = FormsQueue.getLast();
        return FormsQueue.remove();
    }

    public Forms getLast() {
        return last;
    }

    private Forms generateLast() {
        Random random = new Random();
        int num = random.nextInt(7);
        Forms nextForms=new I(new Position(10,0));

        switch (num){
            case 0:
                nextForms = new I(new Position(10,0));
                break;
            case 1:
                nextForms = new J(new Position(10,1));
                break;
            case 2:
                nextForms = new L(new Position(10,1));
                break;
            case 3:
                nextForms = new O(new Position(10,1));
                break;
            case 4:
                nextForms = new S(new Position(10,1));
                break;
            case 5:
                nextForms = new T(new Position(10,1));
                break;
            case 6:
                nextForms = new Z(new Position(10,1));
        }


        return nextForms;
    }

}
