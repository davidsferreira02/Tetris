package com.aor.tetris.controller;

import com.aor.tetris.controller.game.HeroController;
import com.aor.tetris.model.Position;
import com.aor.tetris.model.game.arena.Arena;
import com.aor.tetris.model.game.elements.Hero;
import com.aor.tetris.model.game.elements.Wall;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HeroControllerTest {
    private HeroController controller;
    private Hero hero;
    private Arena arena;

    @BeforeEach
    void setUp() {
        arena = new Arena(10, 10);

        hero = new Hero(5, 5);
        arena.setHero(hero);

        arena.setWalls(Arrays.asList());
        arena.setMonsters(Arrays.asList());

        controller = new HeroController(arena);
    }

    @Test
    void moveHeroRightEmpty() {
        controller.moveHeroRight();
        assertEquals(new Position(6, 5), hero.getPosition());
    }

    @Test
    void moveHeroRightNotEmpty() {
        arena.setWalls(Arrays.asList(new Wall(6, 5)));
        controller.moveHeroRight();
        assertEquals(new Position(5, 5), hero.getPosition());
    }
}