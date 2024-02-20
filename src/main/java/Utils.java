import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Utils {


    public static int[] getOddsFromOneToValue(int value) {
        return IntStream.rangeClosed(1, value)
                .filter(n -> n % 2 != 0)
                .toArray();
    }

    public boolean containsKeyWord(String s) {
        List<String> keywordsList = Arrays.asList(
                "abstract", "continue", "for", "new", "switch", "assert", "default", "goto",
                "package", "synchronized", "boolean", "do", "if", "private", "this", "break",
                "double", "implements", "protected", "throw", "byte", "else", "import", "public",
                "throws", "case", "enum", "instanceof", "return", "transient", "catch", "extends",
                "int", "short", "try", "char", "final", "interface", "static", "void", "class",
                "finally", "long", "strictfp", "volatile", "const", "float", "native", "super", "while"
        );

        return Arrays.stream(s.split(" ")).anyMatch(word -> keywordsList.contains(word));
    }

}
