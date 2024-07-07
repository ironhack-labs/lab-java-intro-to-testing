import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ElfTest {

    private Elf elf;

    @BeforeEach
    public void setUp() {
        elf = new Elf(100, 20, 3, 15);
    }

    @Test
    public void testGettersAndSetters() {
        assertEquals(100, elf.getHealth());
        assertEquals(20, elf.getStrength());
        assertEquals(3, elf.getLives());
        assertEquals(15, elf.getSpeed());

        elf.setHealth(90);
        elf.setStrength(25);
        elf.setLives(2);
        elf.setSpeed(20);

        assertEquals(90, elf.getHealth());
        assertEquals(25, elf.getStrength());
        assertEquals(2, elf.getLives());
        assertEquals(20, elf.getSpeed());
    }
}
