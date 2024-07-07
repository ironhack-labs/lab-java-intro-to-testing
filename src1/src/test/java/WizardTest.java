import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WizardTest {

    private Wizard wizard;
    private Elf elf;

    @BeforeEach
    public void setUp() {
        wizard = new Wizard(80, 15, 2, "Fireball");
    }

    @Test
    public void testGettersAndSetters() {
        assertEquals(80, wizard.getHealth());
        assertEquals(15, wizard.getStrength());
        assertEquals(2, wizard.getLives());
        assertEquals("Fireball", wizard.getSpell());

        wizard.setHealth(70);
        wizard.setStrength(20);
        wizard.setLives(1);
        wizard.setSpell("Lightning");

        assertEquals(70, wizard.getHealth());
        assertEquals(20, wizard.getStrength());
        assertEquals(1, wizard.getLives());
        assertEquals("Lightning", wizard.getSpell());
    }

    @Test
    public void testConvertToElf() {
        elf = wizard.convertToElf();
        assertEquals(wizard.getHealth(), elf.getHealth());
        assertEquals(wizard.getStrength(), elf.getStrength());
        assertEquals(wizard.getLives(), elf.getLives());
        assertEquals(0, elf.getSpeed());
    }
}
