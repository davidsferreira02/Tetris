package com.aor.tetris.controller;

import com.aor.tetris.Game;
import com.aor.tetris.gui.GUI;
import com.aor.tetris.model.game.EndGame.EndGame;
import com.aor.tetris.model.menu.Menu;
import com.aor.tetris.states.MenuState;

import java.io.IOException;

public abstract class EndGameController extends Controller<EndGame>{

    public EndGameController (EndGame end){
        super(end);
    }

    public void step(Game game, GUI.ACTION action, long time) throws IOException{
        if(action== GUI.ACTION.SELECT){
            game.setState(new MenuState(new Menu()));
        }
    }
}
