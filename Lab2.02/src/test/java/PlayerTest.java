import Ironhack.schl.ConcretePlayer;
import Ironhack.schl.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    public void testDecrementLive() {
        Player player = new ConcretePlayer(100, 20, 3);
        player.decrementLive();
        assertEquals(2, player.getLives());
        assertEquals(100, player.getHealth());

        player.decrementLive();
        assertEquals(1, player.getLives());
        assertEquals(100, player.getHealth());

        player.decrementLive();
        assertEquals(0, player.getLives());
        System.out.println("This character died.");
    }

    @Test
    public void testAttack() {
        ConcretePlayer player1 = new ConcretePlayer(100, 20, 3);
        ConcretePlayer player2 = new ConcretePlayer(80, 15, 2);

        player1.attack(player2);
        assertEquals(60, player2.getHealth());
    }

    @Test
    public void testCheckHealth() {
        ConcretePlayer player = new ConcretePlayer(0, 20, 3);
        player.checkHealth();
        assertEquals(2, player.getLives());
        assertEquals(100, player.getHealth());
    }
}