package com.ironhack.videoGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest extends PlayerTest {

    @Test
    void convertToElf() {
        Warrior warrior = new Warrior(100, 20, 3, 15);
        Elf elf = warrior.convertToElf();
        assertEquals(warrior.getHealth(), elf.getHealth());
        assertEquals(warrior.getStrength(), elf.getStrength());
        assertEquals(warrior.getLives(), elf.getLives());
        assertEquals(15, elf.getSpeed());
    }
}