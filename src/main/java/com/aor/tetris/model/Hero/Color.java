package com.aor.tetris.model.Hero;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Color{
    private final Map<String, String> COLORS = new HashMap<>();

    public Color(){
        loadCOLOR();
    }

    private void loadCOLOR(){
        COLORS.put("CYAN", "#00FFFF");
        COLORS.put("YELLOW", "#FFFF00");
        COLORS.put("PURPLE", "#800080");
        COLORS.put("GREEN", "#00FF00");
        COLORS.put("RED", "#FF0000");
        COLORS.put("BLUE", "#0000FF");
        COLORS.put("ORANGE", "#FF7F00");
        COLORS.put("WHITE", "#FFFFFF");
        COLORS.put("LIGHT_GRAY","#B3B3B3");
        COLORS.put("GRAY","#666666");
        COLORS.put("DARKER_GRAY","#4B4B4B");


    }

    public String getColor(String color){
        return COLORS.get(color);
    }
}

