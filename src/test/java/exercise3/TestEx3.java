package exercise3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEx3 {
    private Warrior warrior;
    private Elf elf;
    private Wizard wizard;
    private Player playerToAttack;

    @BeforeEach
    public void setUp() {
        warrior = new Warrior(100, 20, 3, 50);
        elf = new Elf(80, 15, 4, 30);
        wizard = new Wizard(90, 10, 5, "Fireball");
        playerToAttack = new Warrior(100, 20, 3, 50);
    }

    @Test
    public void testWarrior() {
        assertEquals(100, warrior.getHealth());
        assertEquals(20, warrior.getStrength());
        assertEquals(3, warrior.getLives());
        assertEquals(50, warrior.getForce());
    }

    @Test
    public void testElf() {
        assertEquals(80, elf.getHealth());
        assertEquals(15, elf.getStrength());
        assertEquals(4, elf.getLives());
        assertEquals(30, elf.getSpeed());
    }

    @Test
    public void testWizard() {
        assertEquals(90, wizard.getHealth());
        assertEquals(10, wizard.getStrength());
        assertEquals(5, wizard.getLives());
        assertEquals("Fireball", wizard.getSpell());
    }

    @Test
    public void testAttack() {
        warrior.attack(playerToAttack);
        assertEquals(80, playerToAttack.getHealth());
    }

    @Test
    public void testCheckHealth() {
        warrior.setHealth(0);
        warrior.checkHealth();
        assertEquals(2, warrior.getLives());
    }

    @Test
    public void testConvertToElf() {
        Elf elfFromWarrior = warrior.convertToElf();
        assertEquals(100, elfFromWarrior.getHealth());
        assertEquals(20, elfFromWarrior.getStrength());
        assertEquals(3, elfFromWarrior.getLives());
        assertEquals(0, elfFromWarrior.getSpeed());

        Elf elfFromWizard = wizard.convertToElf();
        assertEquals(90, elfFromWizard.getHealth());
        assertEquals(10, elfFromWizard.getStrength());
        assertEquals(5, elfFromWizard.getLives());
        assertEquals(0, elfFromWizard.getSpeed());
    }
}
