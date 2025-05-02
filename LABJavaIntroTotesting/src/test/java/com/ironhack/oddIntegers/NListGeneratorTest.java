package com.ironhack.oddIntegers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NListGeneratorTest {

    @Test
    @DisplayName("Should generate a list of positive odd numbers from 0 to n")
    void generatePositiveOddList() {
        List<Integer> expected = List.of(1, 3, 5, 7);
        int n = 7;
        NListGenerator generator = new NListGenerator(n);
        List<Integer> result = generator.generateOddList();
        assertIterableEquals(expected, result);

        }

    @Test
    @DisplayName("Should generate a list of negative odd numbers 0 down to -n")
    void generateNegativeOddList() {
        List<Integer> expected = List.of(-1, -3, -5, -7);
        int n = -7;
        NListGenerator generator = new NListGenerator(n);
        List<Integer> result = generator.generateOddList();
        assertIterableEquals(expected, result);
    }

    @Test
    @DisplayName("Should return an empty list when n is 0")
    void generateZeroOddList() {
        List<Integer> expected = List.of();
        int n = 0;
        NListGenerator generator = new NListGenerator(n);
        List<Integer> result = generator.generateOddList();
        assertIterableEquals(expected, result);
    }
    @Test
    @DisplayName("Should generate [1] when n is 1")
    void generateOddListOne() {
        List<Integer> expected = List.of(1);
        int n = 1;
        NListGenerator generator = new NListGenerator(n);
        List<Integer> result = generator.generateOddList();
        assertIterableEquals(expected, result);
    }

    @Test
    @DisplayName("Should generate [-1] when n is -1")
    void generateOddListMinusOne() {
        List<Integer> expected = List.of(-1);
        int n = -1;
        NListGenerator generator = new NListGenerator(n);
        List<Integer> result = generator.generateOddList();
        assertIterableEquals(expected, result);
    }
}
