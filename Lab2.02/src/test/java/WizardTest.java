import Ironhack.schl.Elf;
import Ironhack.schl.Wizard;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WizardTest {

    @Test
    public void testConvertToElf() {
        Wizard wizard = new Wizard(100, 20, 3, "Fireball");
        Elf elf = wizard.convertToElf();
        assertEquals(100, elf.getHealth());
        assertEquals(20, elf.getStrength());
        assertEquals(3, elf.getLives());
        assertEquals(10, elf.getSpeed());
    }
}