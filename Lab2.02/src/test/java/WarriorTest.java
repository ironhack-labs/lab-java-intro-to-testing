import Ironhack.schl.Elf;
import Ironhack.schl.Warrior;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class WarriorTest {

    @Test
    public void testConvertToElf() {
        Warrior warrior = new Warrior(100, 20, 3, 50);
        Elf elf = warrior.convertToElf();
        assertEquals(100, elf.getHealth());
        assertEquals(20, elf.getStrength());
        assertEquals(3, elf.getLives());
        assertEquals(10, elf.getSpeed());
    }
}