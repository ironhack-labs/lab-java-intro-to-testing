import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OddIntegersTest {

    @Test
    public void testOddIntegers() {
        assertArrayEquals(new int[]{1, 3, 5, 7, 9}, OddIntegers.getOddIntegers(10));
        assertArrayEquals(new int[]{1, 3, 5, 7}, OddIntegers.getOddIntegers(8));
        assertArrayEquals(new int[]{}, OddIntegers.getOddIntegers(0));
        assertArrayEquals(new int[]{1}, OddIntegers.getOddIntegers(1));
        assertArrayEquals(new int[]{1, 3}, OddIntegers.getOddIntegers(3));
    }
}