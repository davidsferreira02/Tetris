package com.aor.tetris.model.Arena;

import com.aor.tetris.model.Forms.Forms;
import com.aor.tetris.model.Forms.QueueOfForms;

public class Screen {


    private Arena arena;
    private QueueOfForms queueOfForms;
    private Forms forms;

    private final int width;
    private final int height;


    public Screen(int width, int height) {
        this.width = width;
        this.height = height;

        this.arena = new Arena(width, height);
        this.queueOfForms = new QueueOfForms();
        this.forms = queueOfForms.popNext();
    }

    public QueueOfForms getQueueOfForms() {
        return queueOfForms;
    }

    public Arena getArena() { return arena; }
    public Forms getForms() { return forms; }
    
    public void setForms(Forms forms) { this.forms= forms;}

}
