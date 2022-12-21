package tetris_game;

import tetris_game.gui.LanternaGUI;
import tetris_game.model.menu.Menu;
import tetris_game.states.menu.MenuState;
import tetris_game.states.State;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

public class Game {
    private static Game instance;
    private State state;
    private final LanternaGUI gui;


    public Game() throws IOException, URISyntaxException, FontFormatException {
        gui = new LanternaGUI(34, 22);
        state = new MenuState(new Menu());
    }

    public static Game getInstance() throws IOException, URISyntaxException, FontFormatException {
        if (instance == null){
            instance = new Game();
        }
        return instance;
    }

    public static void main(String[] args) throws IOException, URISyntaxException, FontFormatException, InterruptedException {
        getInstance().start();
    }

    public void setState(State state){
        this.state = state;
    }
    public State getState(){
        return state;
    }

    private void start() throws IOException, InterruptedException {
        int FPS = 40;
        int frameTime = 1000 / FPS;

        while (this.state != null) {
            long startTime = System.currentTimeMillis();

            state.step(this, gui, startTime);

            long elapsedTime = System.currentTimeMillis() - startTime;
            long sleepTime = frameTime - elapsedTime;

           // try {
                if (sleepTime > 0) Thread.sleep(sleepTime);
           // } catch (InterruptedException e) {

           // }
        }

        gui.close();
    }

}
