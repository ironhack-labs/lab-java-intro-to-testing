package exercise1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class testEx1 {
    @Test
    public void getOddInts() {
        int[] expected = {1, 3, 5, 7, 9};
        assertArrayEquals(expected, ex1.getOddInts(10));
    }
}
