package com.aor.tetris.model.Hero;

public class BlockHero {

    private String color;

    public BlockHero(String color){
        this.color = color;
    }

    public BlockHero(int width, int height) {
    }

    public String getColor(){
        return color;
    }
}
