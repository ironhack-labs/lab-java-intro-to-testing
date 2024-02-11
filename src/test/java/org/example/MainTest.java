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
        assertEquals(Arrays.asList(1, 3), main.buildArrayOddInts(5));
    }

    @DisplayName("Test for n = 1")
    @Test
    void arrayOddInts_Testn1() {
        assertEquals(Arrays.asList(), main.buildArrayOddInts(1));
    }

    @DisplayName("Test for n = -1")
    @Test
    void arrayOddInts_Testnegativen() {
        assertEquals(Arrays.asList(), main.buildArrayOddInts(-1));
    }

    @DisplayName("Test for n = 6 (even num)")
    @Test
    void arrayOddInts_TestnEven() {
        assertEquals(Arrays.asList(1,3,5), main.buildArrayOddInts(6));
    }

    @DisplayName("Detect keywords")
    @Test
    void detectingKeywords() {
        assertEquals(false,main.detectKeywords("Hello my name is Laura"));
        assertEquals(true,main.detectKeywords("Hello my name is Laura and I am short"));
        assertEquals(true,main.detectKeywords("Don't break my heart"));
        assertEquals(false,main.detectKeywords("I love to breakdance"));
    }
}