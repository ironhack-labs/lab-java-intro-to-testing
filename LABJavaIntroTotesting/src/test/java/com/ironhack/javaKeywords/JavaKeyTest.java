package com.ironhack.javaKeywords;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaKeyTest {

    @Test
    @DisplayName("Should return if exist any Java Keyword")
    void compareKeyString() {
        JavaKey jk = new JavaKey("The word static is a Key Word.");
        String result = jk.compareKeyString();
        assertTrue(result.contains("static"));

    }
    @Test
    @DisplayName("Should return if doesn't exist any Java Keyword")
    void compareKeyStringNoKeyWord() {
        JavaKey jk = new JavaKey("Any key word exist.");
        String result = jk.compareKeyString();
        assertEquals("Doesn't found any key word.", result);
    }

    @Test
    @DisplayName("Should return Multiple Key Word")
    void compareKeyStringMultipleKeyWord() {
        JavaKey jk = new JavaKey("Lets do a for while we have a if and else");
        String result = jk.compareKeyString();
        assertEquals("Key word found: [do, for, while, if, else]", result);
    }
}