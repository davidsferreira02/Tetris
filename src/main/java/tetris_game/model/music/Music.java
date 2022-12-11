package tetris_game.model.music;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import java.io.File;
import java.util.Objects;

public class Music {
    private final Clip music;
    private static Music instance;

    private Music() {
        this.music = loadMusic();
    }

    public static Music getInstance(){
        if (instance == null){
            instance = new Music();
        }
        return instance;
    }

    private Clip loadMusic() throws NullPointerException {
        try {
            File musicFile = new File(Objects.requireNonNull(Music.class.getResource("/tetris.wav")).getFile());
            //File musicFile = new File("D:\\LDTS\\tetris.wav");
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicFile);
            Clip musicClip = AudioSystem.getClip();
            musicClip.open(audioInput);
            FloatControl gainControl = (FloatControl) musicClip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(-25.0f);
            System.out.println(musicClip);
            return musicClip;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void startMusic() {
        music.setMicrosecondPosition(0);
        music.start();
        music.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public void stopMusic() {
        music.stop();
    }
}