package tetris_game.model.hero;

import java.util.HashMap;
import java.util.Map;

public class Color{
    private final Map<String, String> color = new HashMap<>();

    public Color(){
        loadColor();
    }

    private void loadColor(){
        color.put("GRAY","#666666");
        color.put("WHITE", "#FFFFFF");
        color.put("GREEN", "#00FF00");
        color.put("BLUE", "#0000FF");
        color.put("YELLOW", "#FFFF00");
        color.put("CYAN", "#00FFFF");
        color.put("PURPLE", "#800080");
        color.put("RED", "#FF0000");
        color.put("ORANGE", "#FF7F00");
        color.put("LIGHT_GRAY","#B3B3B3");
        color.put("DARKER_GRAY","#4B4B4B");


    }

    public String getColor(String color){
        return this.color.get(color);
    }
}

