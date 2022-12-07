package tetris_game.model.Arena;

import tetris_game.model.Forms.Forms;
import tetris_game.model.Forms.QueueOfForms;
import tetris_game.model.Stats;

public class Screen {


    private Arena arena;
    private QueueOfForms queueOfForms;
    private Forms forms;
    private Stats stats;
    private final int width;
    private final int height;


    public Screen(int width, int height) {
        this.width = width;
        this.height = height;
        this.arena = new Arena(width, height);
        this.queueOfForms = new QueueOfForms();
        this.forms = queueOfForms.popNext();
        this.stats = new Stats();
    }

    public QueueOfForms getQueueOfForms() {
        return queueOfForms;
    }

    public int getHeight(){return height;}

    public int getWidth(){return width;}

    public Arena getArena() { return arena; }
    public Forms getForms() {
        return this.forms;
    }

    public void setForms(Forms forms) {
        this.forms = forms;
    }

    public Stats getStats() {
        return this.stats;
    }

}
