import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class OddIntegersTest {

    @Test
    public void testOddIntegersUpTo1() {
        int[] expected = {1};
        assertArrayEquals(expected, OddNumbers.getOddIntegers(1));
    }

    @Test
    public void testOddIntegersUpTo5() {
        int[] expected = {1, 3, 5};
        assertArrayEquals(expected, OddNumbers.getOddIntegers(5));
    }

    @Test
    public void testOddIntegersUpTo10() {
        int[] expected = {1, 3, 5, 7, 9};
        assertArrayEquals(expected, OddNumbers.getOddIntegers(10));
    }

    @Test
    public void testOddIntegersUpTo0() {
        int[] expected = {};
        assertArrayEquals(expected, OddNumbers.getOddIntegers(0));
    }

    @Test
    public void testOddIntegersUpToNegative() {
        int[] expected = {};
        assertArrayEquals(expected, OddNumbers.getOddIntegers(-5));
    }
}
