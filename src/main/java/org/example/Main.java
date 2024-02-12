package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Elf elf = new Elf(30,8,3,15);
        elf.decrementLive();
        System.out.println(elf.getLives());
        elf.decrementLive();
        System.out.println(elf.getLives());
        elf.decrementLive();
        System.out.println(elf.getLives());
        elf.decrementLive();
        System.out.println(elf.getLives());

    }

    // method that takes in an integer n and returns an array of all odd integers from 1 to n.
    public List<Integer> buildArrayOddInts(int n) {
        List arrayOddInts = new ArrayList();
        for (int i=0; i<n; i++) {
            if (i%2 == 0 && i!=n-1) {
                arrayOddInts.add(i+1);
            }
        }
        return arrayOddInts;
    }

    // method that takes in a String and returns true if the String contains any Java Keywords
    public boolean detectKeywords(String str) {
        List<String> keywords = new ArrayList<>();
        keywords = Arrays.asList("abstract", "assert", "boolean",
                "break", "byte", "case", "catch", "char", "class", "const",
                "continue", "default", "do", "double", "else", "extends", "false",
                "final", "finally", "float", "for", "goto", "if", "implements",
                "import", "instanceof", "int", "interface", "long", "native",
                "new", "null", "package", "private", "protected", "public",
                "return", "short", "static", "strictfp", "super", "switch",
                "synchronized", "this", "throw", "throws", "transient", "true",
                "try", "void", "volatile", "while");

        List<String> wordsList = Arrays.stream(str.split(" ")).toList();
        for (String word : wordsList) {
            for (String keyword : keywords) {
                if (word.equals(keyword)) {
                    return true;
                }
            }
        }
        return false;
    }
}