package org.example.PlayerClass;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


class PlayerTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    Warrior warrior;
    Wizard wizard;
    Elf elf;

    @BeforeEach
    void setPlayers(){
        System.setOut(new PrintStream(outputStreamCaptor));
        this.warrior = new Warrior(10,10,10, 10);
        this.wizard = new Wizard(10,10,10, 10);
        this.elf = new Elf(10,10,10, 10);
    }

    @AfterEach
    void closePrintln(){
        System.setOut(originalOut);
    }


    //TESTING OF DECREMENTLIVE() METHOD
    @Test @Tag("decrementLive")
    void warriorDecrementsLive() {
        this.warrior.setHealth(0);
        this.warrior.decrementLive();
        assertEquals(9,this.warrior.getLives());
        assertEquals(10,this.warrior.getHealth());
    }

    @Test @Tag("decrementLive")
    void warriorIsDefeated() {
        this.warrior.setLives(1);
        this.warrior.decrementLive();
        assertEquals("This character is dead", outputStreamCaptor.toString().trim());
    }

    @Test @Tag("decrementLive")
    void wizardDecrementsLive() {
        this.wizard.setHealth(0);
        this.wizard.decrementLive();
        assertEquals(9,this.wizard.getLives());
        assertEquals(10,this.wizard.getHealth());
    }
    @Test @Tag("decrementLive")
    void wizardIsDefeated() {
        this.wizard.setLives(1);
        this.wizard.decrementLive();
        assertEquals("This character is dead", outputStreamCaptor.toString().trim());
    }
    @Test @Tag("decrementLive")
    void elfDecrementsLive() {
        this.elf.setHealth(0);
        this.elf.decrementLive();
        assertEquals(9,this.elf.getLives());
        assertEquals(10,this.elf.getHealth());
    }
    @Test @Tag("decrementLive")
    void elfIsDefeated() {
        this.elf.setLives(1);
        this.elf.decrementLive();
        assertEquals("This character is dead", outputStreamCaptor.toString().trim());
    }






    //TESTING OF CHECKHEALTH() METHOD
    @Test @Tag("checkHealth")
    void wizardHealthDecrementsLive(){
        this.wizard.setHealth(0);
        this.wizard.checkHealth();
        assertEquals(9,this.wizard.getLives());
        assertEquals(10,this.wizard.getHealth());

    }

    @Test @Tag("checkHealth")
    void wizardHealthDontDecrementsLive(){
        this.wizard.checkHealth();
        assertEquals(10,this.wizard.getLives());
        assertEquals(10,this.wizard.getHealth());
    }

    @Test @Tag("checkHealth")
    void warriorHealthDecrementsLive(){
        this.warrior.setHealth(0);
        this.warrior.checkHealth();
        assertEquals(9,this.warrior.getLives());
        assertEquals(10,this.warrior.getHealth());
    }

    @Test @Tag("checkHealth")
    void warriorHealthDontDecrementsLive(){
        this.warrior.checkHealth();
        assertEquals(10,this.warrior.getLives());
        assertEquals(10,this.warrior.getHealth());
    }

    @Test @Tag("checkHealth")
    void elfHealthDecrementsLive(){
        this.elf.setHealth(0);
        this.elf.checkHealth();
        assertEquals(9,this.elf.getLives());
        assertEquals(10,this.elf.getHealth());
    }

    @Test @Tag("checkHealth")
    void elfHealthDontDecrementsLive(){
        this.elf.checkHealth();
        assertEquals(10,this.elf.getLives());
        assertEquals(10,this.elf.getHealth());
    }





    //TESTING OF ATTACK() METHOD
    @Test @Tag("attack")
    void wizardAttacks() {
        this.wizard.setStrength(5);
        this.wizard.attack(warrior);
        assertEquals(5,this.warrior.getHealth());
    }
    @Test @Tag("attack")
    void warriordAttacks() {
        this.warrior.setStrength(5);
        this.warrior.attack(wizard);
        assertEquals(5,this.wizard.getHealth());
    }

    @Test @Tag("attack")
    void elfAttacks() {
        this.elf.setStrength(5);
        this.elf.attack(warrior);
        assertEquals(5,this.warrior.getHealth());
    }



    //TESTING OF CONVERTSTOELF() METHOD
    @Test @Tag("convertToElf")
    void warriorConvertsToElf(){
        assertEquals(Elf.class,this.warrior.convertToElf().getClass());
    }

    @Test @Tag("convertToElf")
    void wizardConvertsToElf(){
        assertEquals(Elf.class,this.wizard.convertToElf().getClass());
    }
}