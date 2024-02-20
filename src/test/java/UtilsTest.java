import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    private Utils utils;


    @BeforeEach
    public void setUp() {
        utils = new Utils();
    }

    @Test
    @DisplayName("Should take an integer n and return all odd integers from 1 to n")
    void getOddsFromOneToValue()  {
        assertEquals(Utils.getOddsFromOneToValue(3).length, 2);
        assertEquals(Utils.getOddsFromOneToValue(5).length, 3);
    }

    @Test
    @DisplayName("Should return true when receive a String containing a keyword")
    void containsKeyWord()  {
        assertTrue(utils.containsKeyWord("Don't break my heart"));
        assertFalse(utils.containsKeyWord("I love to breakdance"));
    }

}