package tetris_game.model.arena;

import tetris_game.model.forms.Forms;
import tetris_game.model.forms.QueueOfForms;
import tetris_game.model.music.Music;
import tetris_game.model.Stats;

public class Screen {


    private Arena arena;
    private QueueOfForms queueOfForms;
    private Forms forms;
    private Stats stats;

    private Music music;
    private final int width;
    private final int height;


    public Screen(int width, int height) {
        this.width = width;
        this.height = height;

        this.music = Music.getInstance();

        this.arena = new Arena(width, height);
        this.queueOfForms = new QueueOfForms();
        this.forms = queueOfForms.popNext();
        this.stats = new Stats();

        startMusic();
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

    public void startMusic(){
        music.startMusic();
    }

    public void stopMusic(){
        music.stopMusic();
    }

}
