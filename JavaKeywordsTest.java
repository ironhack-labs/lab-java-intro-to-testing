import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JavaKeywordsTest {

    @Test
    public void testContainsJavaKeyword() {
        assertTrue(JavaKeywords.containsJavaKeyword("Don't break my heart"));
        assertFalse(JavaKeywords.containsJavaKeyword("I love to breakdance"));
        assertTrue(JavaKeywords.containsJavaKeyword("Public announcement"));
        assertFalse(JavaKeywords.containsJavaKeyword("This is a regular sentence"));
        assertTrue(JavaKeywords.containsJavaKeyword("return the value"));
    }
}