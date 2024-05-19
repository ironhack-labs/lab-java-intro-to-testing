import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    public void testPlayerAttributes() {
        Warrior warrior = new Warrior(100, 10, 3, 5);
        assertEquals(100, warrior.getHealth());
        assertEquals(10, warrior.getStrength());
        assertEquals(3, warrior.getLives());
        assertEquals(5, warrior.getForce());
    }

    @Test
    public void testDecrementLive() {
        Warrior warrior = new Warrior(100, 10, 1, 5);
        warrior.setHealth(0);
        warrior.checkHealth();
        assertEquals(0, warrior.getLives());
        assertEquals(100, warrior.getHealth());
    }

    @Test
    public void testAttack() {
        Warrior warrior = new Warrior(100, 10, 3, 5);
        Elf elf = new Elf(50, 5, 3, 10);
        warrior.attack(elf);
        assertEquals(40, elf.getHealth());
    }

    @Test
    public void testConvertToElf() {
        Warrior warrior = new Warrior(100, 10, 3, 5);
        Elf elf = warrior.convertToElf();
        assertEquals(100, elf.getHealth());
        assertEquals(10, elf.getStrength());
        assertEquals(3, elf.getLives());
        assertEquals(5, elf.getSpeed());
    }

    @Test
    public void testWizardToElf() {
        Wizard wizard = new Wizard(100, 10, 3, "Fireball");
        Elf elf = wizard.convertToElf();
        assertEquals(100, elf.getHealth());
        assertEquals(10, elf.getStrength());
        assertEquals(3, elf.getLives());
        assertEquals(0, elf.getSpeed()); // Assuming 0 speed as spell to speed conversion is not defined
    }
}
