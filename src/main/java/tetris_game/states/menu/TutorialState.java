package tetris_game.states.menu;

import tetris_game.controller.Controller;
import tetris_game.controller.menu.TutorialController;
import tetris_game.model.menu.Tutorial;
import tetris_game.states.State;
import tetris_game.viewer.menu.TutorialViewer;
import tetris_game.viewer.Viewer;

public class TutorialState extends State<Tutorial> {
    public TutorialState(Tutorial model){
        super(model);
    }

    @Override
    protected Viewer<Tutorial> getViewer() {
        return new TutorialViewer(getModel());
    }

    @Override
    protected Controller<Tutorial> getController() {
        return new TutorialController(getModel());
    }
}