import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    private Warrior warrior1;
    private Warrior warrior2;

    @BeforeEach
    public void setUp() {
        warrior1 = new Warrior(100, 20, 3,60);
        warrior2 = new Warrior(80, 15, 2,70);
    }

    @Test
    public void testInitialValues() {
        assertEquals(100, warrior1.getHealth());
        assertEquals(20, warrior1.getStrength());
        assertEquals(3, warrior1.getLives());

        assertEquals(80, warrior2.getHealth());
        assertEquals(15, warrior2.getStrength());
        assertEquals(2, warrior2.getLives());
    }

    @Test
    public void testAttack() {
        warrior1.attack(warrior2);
        assertEquals(60, warrior2.getHealth());
        assertEquals(2, warrior2.getLives());

        warrior2.attack(warrior1);
        assertEquals(85, warrior1.getHealth());
        assertEquals(3, warrior1.getLives());
    }

    @Test
    public void testCheckHealth() {
        warrior2.setHealth(0);
        warrior2.checkHealth();
        assertEquals(80, warrior2.getHealth()); // Restored health
        assertEquals(1, warrior2.getLives());
    }

    @Test
    public void testDecrementLive() {
        warrior2.decrementLive();
        assertEquals(80, warrior2.getHealth()); // Restored health
        assertEquals(1, warrior2.getLives());

        warrior2.decrementLive();
        assertEquals(80, warrior2.getHealth());
        assertEquals(0, warrior2.getLives());

        warrior2.decrementLive(); // Should print "This character is dead"
        assertEquals(80, warrior2.getHealth());
        assertEquals(0, warrior2.getLives());
    }

    @Test
    public void testDeadCharacter() {
        warrior2.setLives(1);
        warrior2.setHealth(10);

        warrior1.attack(warrior2);
        assertEquals(0, warrior2.getLives());
        assertEquals(80, warrior2.getHealth());

        warrior1.attack(warrior2); // Further attack should not decrement lives
        assertEquals(0, warrior2.getLives());
        assertEquals(60, warrior2.getHealth()); // Health still decreases
    }
}
