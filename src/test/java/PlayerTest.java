import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlayerTest {

    Warrior warrior;
    Wizard wizard;
    Elf elf;

    @Test
    @DisplayName("Should create a warrior and convert it into an elf with the exact feature values and the default speed")
    void convertWarriorToElf() {
        warrior = new Warrior(100, 10, 3, 5);

        elf = warrior.convertToElf();

        assertTrue(warrior instanceof Warrior);
        assertEquals(5, warrior.getForce());

        assertTrue(elf instanceof Elf);

        assertEquals(warrior.getHealth(), warrior.getInitialHealth());
        assertEquals(warrior.getHealth(), elf.getHealth());
        assertEquals(warrior.getStrength(), elf.getStrength());
        assertEquals(warrior.getLives(), elf.getLives());
        assertEquals(Elf.DEFAULT_SPEED, elf.getSpeed());
    }

    @Test
    @DisplayName("Should create a wizard and convert it into an elf with the exact feature values and the default speed")
    void convertWizardToElf() {
        wizard = new Wizard(100, 10, 3, 5);

        elf = wizard.convertToElf();

        assertTrue(wizard instanceof Wizard);
        assertEquals(5, wizard.getSpell());

        assertTrue(elf instanceof Elf);
        assertEquals(100, elf.getHealth());
        assertEquals(10, elf.getStrength());
        assertEquals(3, elf.getLives());

        assertEquals(Elf.DEFAULT_SPEED, elf.getSpeed());
    }

    @Test
    @DisplayName("Should create a copy of one wizard with the same feature values")
    void createTwoDifferentWizards() {
        Wizard wizard = new Wizard(100, 10, 3, 5);
        Wizard wizardCopy = new Wizard(100, 10, 3, 5);

        assertTrue(wizard.equals(wizardCopy));
    }
    @Test
    @DisplayName("An Elf should attack a warrior and a wizard and decrease their health by -25")
    void decrementHealth() {
        wizard = new Wizard(80, 40, 3, 5);
        warrior = new Warrior(100, 90, 3, 5);
        elf = new Elf(300, 25, 3 ,5);
        int initialWarriorHealth = warrior.getHealth();
        int initialWizardHealth = wizard.getHealth();

        elf.attack(warrior);
        elf.attack(wizard);

        assertEquals(initialWarriorHealth - elf.getStrength(), warrior.getHealth());
        assertEquals(initialWizardHealth - elf.getStrength(), wizard.getHealth());
    }

    @Test
    @DisplayName("An elf should kill a warrior")
    void decrementLive() {
        warrior = new Warrior(100, 90, 3, 5);
        elf = new Elf(300, 25, 3 ,5);
        int initialWarriorLives = warrior.getLives();

        elf.attack(warrior);
        elf.attack(warrior);
        elf.attack(warrior);
        elf.attack(warrior);

        assertEquals(initialWarriorLives - 1, warrior.getLives());
    }
}
