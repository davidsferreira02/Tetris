package com.aor.tetris.states.Menu;

import com.aor.tetris.controller.Controller;
import com.aor.tetris.controller.Menu.TutorialController;
import com.aor.tetris.model.menu.Tutorial;
import com.aor.tetris.states.State;
import com.aor.tetris.viewer.menu.TutorialViewer;
import com.aor.tetris.viewer.Viewer;

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