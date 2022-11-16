package com.aor.tetris.states;


import com.aor.tetris.controller.Controller;
import com.aor.tetris.controller.menu.TutorialController;
import com.aor.tetris.model.menu.Tutorial;
import com.aor.tetris.viewer.Viewer;
import com.aor.tetris.viewer.menu.TutorialViewer;

public class TutorialState extends State<Tutorial>{
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