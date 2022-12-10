package com.aor.tetris.states;


import com.aor.tetris.controller.Controller;
import com.aor.tetris.controller.menu.AboutController;
import com.aor.tetris.controller.menu.TutorialController;
import com.aor.tetris.model.menu.About;
import com.aor.tetris.model.menu.Tutorial;
import com.aor.tetris.viewer.Viewer;
import com.aor.tetris.viewer.menu.AboutViewer;
import com.aor.tetris.viewer.menu.TutorialViewer;


public class AboutState extends State<About>{
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