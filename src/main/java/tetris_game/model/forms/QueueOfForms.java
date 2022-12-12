package tetris_game.model.forms;

import tetris_game.model.hero.Position;

import java.util.ArrayDeque;
import java.util.Random;

public class QueueOfForms {
    private ArrayDeque<Forms> FormsQueue = new ArrayDeque();
    private Forms last;

    public QueueOfForms() {
        for(int i = 0; i < 1; ++i) {
            this.FormsQueue.add(this.generateLast());
        }

    }

    public Forms popNext() {
        this.FormsQueue.add(this.generateLast());
        Forms first = (Forms)this.FormsQueue.getFirst();
        this.FormsQueue.remove();
        this.last = (Forms)this.FormsQueue.getLast();
        return first;
    }

    public Forms getLast() {
        return this.last;
    }

    private Forms generateLast() {
        Random random = new Random();
        int num = random.nextInt(7);
        Forms nextForms=new I(new Position(10,0));
        Position pos = new Position(10,1);

        switch (num){
            case 0:
                nextForms = new I(new Position(10,0));
                break;
            case 1:
                nextForms = new J(pos);
                break;
            case 2:
                nextForms = new L(pos);
                break;
            case 3:
                nextForms = new O(pos);
                break;
            case 4:
                nextForms = new S(pos);
                break;
            case 5:
                nextForms = new T(pos);
                break;
            case 6:
                nextForms = new Z(pos);
        }


        return nextForms;
    }
}
