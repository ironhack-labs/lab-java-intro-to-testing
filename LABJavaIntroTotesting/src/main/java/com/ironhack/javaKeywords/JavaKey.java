package com.ironhack.javaKeywords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaKey {
    private String stringKey;
    private final List<String> JAVA_KEYWORDS = Arrays.asList(
            "abstract", "assert", "boolean", "break", "byte",
            "case", "catch", "char", "class", "const",
            "continue", "default", "do", "double", "else",
            "enum", "extends", "final", "finally", "float",
            "for", "goto", "if", "implements", "import",
            "instanceof", "int", "interface", "long", "native",
            "new", "package", "private", "protected", "public",
            "return", "short", "static", "strictfp", "super",
            "switch", "synchronized", "this", "throw", "throws",
            "transient", "try", "void", "volatile", "while",
            "true", "false", "null");


    public JavaKey(String stringKey) {
        this.stringKey = stringKey;

    }

    public String getStringKey() {
        return stringKey;
    }

    public List<String> getJAVA_KEYWORDS() {
        return JAVA_KEYWORDS;
    }

    public String compareKeyString() {

        String[] words = this.stringKey.split("\\s+");
        List<String> foundKeyWords = new ArrayList<>();
        for (String word : words) {
            for (String keyword : JAVA_KEYWORDS) {
                if (word.equalsIgnoreCase((keyword))) {
                    foundKeyWords.add(word);

                }
            }
        }
        if (foundKeyWords.isEmpty()) {
            return "Doesn't found any key word.";
        } else {
            return "Key word found: " + foundKeyWords;
        }
    }
}
