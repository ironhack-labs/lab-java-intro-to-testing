import java.util.HashSet;
import java.util.Set;

public class JavaKeywords {

    private static final Set<String> JAVA_KEYWORDS = new HashSet<>();

    static {
        String[] keywords = {
                "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const", "continue",
                "default", "do", "double", "else", "enum", "extends", "final", "finally", "float", "for", "goto", "if",
                "implements", "import", "instanceof", "int", "interface", "long", "native", "new", "package", "private",
                "protected", "public", "return", "short", "static", "strictfp", "super", "switch", "synchronized", "this",
                "throw", "throws", "transient", "try", "void", "volatile", "while"
        };
        for (String keyword : keywords) {
            JAVA_KEYWORDS.add(keyword);
        }
    }

    public static boolean containsJavaKeyword(String input) {
        for (String keyword : JAVA_KEYWORDS) {
            if (input.contains(keyword)) {
                return true;
            }
        }
        return false;
    }
}
