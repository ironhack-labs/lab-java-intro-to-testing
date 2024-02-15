package exercise2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex2 {
    private static final Set<String> javaKeywords = new HashSet<>(Arrays.asList(
            "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class",
            "const", "continue", "default", "do", "double", "else", "enum", "extends", "final",
            "finally", "float", "for", "goto", "if", "implements", "import", "instanceof", "int",
            "interface", "long", "native", "new", "package", "private", "protected", "public",
            "return", "short", "static", "strictfp", "super", "switch", "synchronized", "this",
            "throw", "throws", "transient", "try", "void", "volatile", "while"
    ));

    public static boolean hasKeyword(String str) {
        for (String word : str.split("\\s+")) {
            if (javaKeywords.contains(word)) {
                return true;
            }
        }
        return false;
    }
}
