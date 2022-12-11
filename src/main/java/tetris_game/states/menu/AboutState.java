package tetris_game.states.menu;


import tetris_game.controller.Controller;
import tetris_game.controller.menu.AboutController;
import tetris_game.model.menu.About;
import tetris_game.states.State;
import tetris_game.viewer.Viewer;
import tetris_game.viewer.menu.AboutViewer;

public class AboutState extends State<About> {
    public AboutState(About menu){
        super(menu);
    }

    @Override
    protected Viewer<About> getViewer() {
        return new AboutViewer(getModel());
    }

    @Override
    protected Controller<About> getController() {
        return new AboutController(getModel());
    }
}