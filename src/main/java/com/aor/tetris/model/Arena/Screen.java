package com.aor.tetris.model.Arena;

import com.aor.tetris.model.Forms.Forms;
import com.aor.tetris.model.Forms.QueueOfForms;
import com.aor.tetris.model.Stats;

public class Screen {


    private Arena arena;
    private QueueOfForms queueOfForms;
    private Forms forms;

    private final int width;
    private final int height;
    private Stats stats;


    public Screen(int width, int height) {
        this.width = width;
        this.height = height;
        this.stats = new Stats();
        this.arena = new Arena(width, height);
        this.queueOfForms = new QueueOfForms();
        this.forms = queueOfForms.popNext();
    }

    public QueueOfForms getQueueOfForms() {
        return queueOfForms;
    }

    public int getHeight(){return height;}

    public int getWidth(){return width;}

    public Arena getArena() { return arena; }
    public Forms getForms() { return forms; }
    
    public void setForms(Forms forms) { this.forms= forms;}

    public Stats getStats() {return stats;}
}
