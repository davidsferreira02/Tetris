package com.aor.tetris.model;

import java.util.HashMap;
import java.util.Map;

public class Color {
    private final Map<String, String> COLOR = new HashMap<>();
    public Color(){
        loadColors();
    }
    private void loadColors(){
        COLOR.put("RED", "#FF0000");
        COLOR.put("LIGHT_GRAY","#B3B3B3");
        COLOR.put("CYAN", "#00FFFF");;
        COLOR.put("GREEN", "#00FF00");
        COLOR.put("WHITE", "#FFFFFF");
        COLOR.put("BLUE", "#0000FF");
        COLOR.put("ORANGE", "#FF7F00");
        COLOR.put("GRAY","#666666");
        COLOR.put("YELLOW", "#FFFF00");
        COLOR.put("DARKER_GRAY","#4B4B4B");
        COLOR.put("PURPLE", "#800080");
    }

    public String getColor(String color){
        return COLOR.get(color);
    }
    public Map<String, String> getCOLORS(){
        return COLOR;
    }

}
