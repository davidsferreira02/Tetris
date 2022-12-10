package tetris_game.model;

public class Stats {
    private int lines = 0;
    private int points = 0;
    private int level = 1;


    public void removedLines(int line) {
        this.lines += line;
        switch (line) {
            case 0:
            default:
                break;
            case 1:
                this.points += 10 * this.level;
                break;
            case 2:
                this.points += 30 * this.level;
                break;
            case 3:
                this.points += 50 * this.level;
                break;
            case 4:
                this.points += 80 * this.level;
        }

        if (this.lines - this.level * 10 >= 0) {
            ++this.level;
        }

    }

    public int getLevel() {
        return this.level;
    }

    public int getLines() {
        return this.lines;
    }

    public int getPoints() {
        return this.points;
    }



}