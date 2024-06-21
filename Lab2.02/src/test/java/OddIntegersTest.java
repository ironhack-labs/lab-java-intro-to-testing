
import Ironhack.schl.OddIntegers;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OddIntegersTest {

    @Test
    public void testOddIntegers_nIs10() {
        OddIntegers oddIntegers = new OddIntegers();
        int[] expected = {1, 3, 5, 7, 9};
        assertArrayEquals(expected, oddIntegers.getOddIntegers(10));
    }

    @Test
    public void testOddIntegers_nIs0() {
        OddIntegers oddIntegers = new OddIntegers();
        int[] expected = {};
        assertArrayEquals(expected, oddIntegers.getOddIntegers(0));
    }

    @Test
    public void testOddIntegers_nIsNegative() {
        OddIntegers oddIntegers = new OddIntegers();
        int[] expected = {};
        assertArrayEquals(expected, oddIntegers.getOddIntegers(-5));
    }

}