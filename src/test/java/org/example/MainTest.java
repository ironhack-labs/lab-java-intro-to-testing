package org.example;

import org.junit.Before;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private final Main main = new Main();

    @DisplayName("Test for n = 3")
    @Test
    void arrayOddInts_Testn3() {
        assertEquals(Arrays.asList(1), main.buildArrayOddInts(3));
    }
    @DisplayName("Test for n = 5")
    @Test
    void arrayOddInts_Testn5() {
        Main main = new Main();

        assertEquals(Arrays.asList(1, 3), main.buildArrayOddInts(5));
    }

    @DisplayName("Test for n = 1")
    @Test
    void arrayOddInts_Testn1() {
        Main main = new Main();

        assertEquals(Arrays.asList(), main.buildArrayOddInts(1));
    }

    @DisplayName("Test for n = -1")
    @Test
    void arrayOddInts_Testnegativen() {
        Main main = new Main();

        assertEquals(Arrays.asList(), main.buildArrayOddInts(-1));
    }

    @DisplayName("Test for n = 6 (even num)")
    @Test
    void arrayOddInts_TestnEven() {
        Main main = new Main();
        assertEquals(Arrays.asList(1,3,5), main.buildArrayOddInts(6));
    }
}