import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JavaKeywordCheckerTest {

    @Test
    public void testContainsJavaKeyword() {
        assertTrue(JavaKeyWordChecker.containsJavaKeyword("Don't break my heart"));
        assertFalse(JavaKeyWordChecker.containsJavaKeyword("I love to breakdance"));
        assertTrue(JavaKeyWordChecker.containsJavaKeyword("This is a class"));
        assertFalse(JavaKeyWordChecker.containsJavaKeyword("This is classic music"));
        assertTrue(JavaKeyWordChecker.containsJavaKeyword("Switch to the new version"));
        assertTrue(JavaKeyWordChecker.containsJavaKeyword("Switching to a new version"));
    }
}
