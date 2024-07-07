import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class JavaKeyWordChecker {

    private static final Set<String> JAVA_KEYWORDS = new HashSet<>(Arrays.asList(
            "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class",
            "const", "continue", "default", "do", "double", "else", "enum", "exports", "extends",
            "final", "finally", "float", "for", "goto", "if", "implements", "import", "instanceof",
            "int", "interface", "long", "module", "native", "new", "package", "private", "protected",
            "public", "requires", "return", "short", "static", "strictfp", "super", "switch",
            "synchronized", "this", "throw", "throws", "transient", "try", "var", "void", "volatile", "while"
    ));

    public static boolean containsJavaKeyword(String input) {
        String[] words = input.split("\\W+");
        for (String word : words) {
            if (JAVA_KEYWORDS.contains(word)) {
                return true;
            }
        }
        return false;
    }
}
