package com.ironhack.videoGame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    private Player player;


    @BeforeEach
    @DisplayName("Should provide a Player Instance")
    void setUp() {
        player = new Player(100,20,30);
    }

    @Test
    @DisplayName("Should decreases Lives and Reset Health when lives is greater than Zero")
    void testDecrementLives() {
    player.decrementLives();
    assertEquals(29, player.getLives());
    assertEquals(100, player.getHealth());

    }

    @Test
    @DisplayName("Should call decrement lives if the live is zero or less")
    void testCheckHealth() {
    player.setHealth(0);
    player.checkHealth();
    assertEquals(29, player.getLives());
    }

    @Test
    @DisplayName("Should attack whe the target is alive")
    void testAttackTargetAlive() {
        Player target = new Player(80, 10, 2);
        String result = player.attack(target);
        assertEquals(80 - player.getStrength(), target.getHealth());
        assertTrue(result.contains("damage has occurred"));
    }
    @Test
    @DisplayName("Should not attack the target is dead")
    void testAttackTargetDead () {
        player.setStrength(0);
        Player target = new Player(80, 10, 2);
        String result = player.attack(target);
        assertEquals("This player cannot attack, doesn't have any strength", result);
    }


}