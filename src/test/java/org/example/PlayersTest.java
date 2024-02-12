package org.example;

import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class PlayersTest {

    private Warrior warrior;
    private Elf elf;
    private Wizard wizard;
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream outContentClean = System.out;

    @BeforeEach
    public void setUp() {
        warrior = new Warrior(20,10,3,15);
        elf = new Elf(30,8,3,15);
        wizard = new Wizard(20,5,3,20);
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void outContentClean(){
        System.setOut(outContentClean);
    }

    @DisplayName("Getters and setters")
    @Test
    void GettersSettersTests() {
        assertEquals(20, warrior.getHealth());
        assertEquals(3, elf.getLives());
        assertEquals(20, wizard.getSpell());

        warrior.setForce(17);
        assertEquals(17, warrior.getForce());
    }

    @DisplayName("Converting to elf")
    @Test
    void Convert_to_Elf() {
        assertEquals(Elf.class, warrior.convertToElf().getClass());
        assertEquals(15, warrior.convertToElf().getSpeed());
        assertEquals(Elf.class, wizard.convertToElf().getClass());
        assertEquals(20, wizard.convertToElf().getSpeed());
    }

    @DisplayName("Decrementing lives")
    @Test
    void Decrement_Lives_and_Dead_Players() {
        assertEquals(3,elf.getLives());
        elf.decrementLive();
        assertEquals(2,elf.getLives());
        elf.decrementLive();
        assertEquals(1,elf.getLives());
        elf.decrementLive();
        assertEquals(0,elf.getLives());
        elf.decrementLive();
        assertEquals("This character is dead", outContent.toString().trim());
        assertEquals(0,elf.getLives());
    }

    @DisplayName("Attacking to decrement lives")
    @Test
    void Attacks_to_Decrement_Lives() {
        // each time the warrior attacks the wizard, wizard's health is decremented by 10 (warrior's strength)
        warrior.attack(wizard);
        assertEquals(10, wizard.getHealth());
        // when the 2nd attack is done, the wizard's health is 20-10-10 = 0
        warrior.attack(wizard);
        // as health is set to 0, it is restored to the initial value (20)
        assertEquals(20, wizard.getHealth());
        //  and lives are decremented by 1 (from 3 to 2)
        assertEquals(2, wizard.getLives());
    }

    @DisplayName("Attacking till death")
    @Test
    void Attacks_till_Death() {
        // for each 2 attacks from the warrior to the wizard, the wizard loses 1 live
        // this means that in 6 attacks the wizard must have 0 lives and the original health points
        for (int i=0; i < 6; i++) {
            warrior.attack(wizard);
        }
        assertEquals(20, wizard.getHealth());
        assertEquals(0, wizard.getLives());

        //  with 2 more attacks, the wizard must die
        for (int i=0; i < 2; i++) {
            warrior.attack(wizard);
        }
        assertEquals(0, wizard.getHealth());
        assertEquals(0, wizard.getLives());
        assertEquals("This character is dead", outContent.toString().trim());
    }
}