package com.ironhack.videoGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WizardTest extends PlayerTest {

    @Test
    void convertToElf() {
        Wizard wizard = new Wizard(100, 20, 3, 15);
        Elf elf = wizard.convertToElf();
        assertEquals(wizard.getHealth(), elf.getHealth());
        assertEquals(wizard.getStrength(), elf.getStrength());
        assertEquals(wizard.getLives(), elf.getLives());
        assertEquals(15, elf.getSpeed());
    }
}