package exercise2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestEx2 {
    @Test
    public void getJavaKeyword() {
        assertTrue(Ex2.hasKeyword("Don't break my heart"), "Expected 'Don't break my heart' to contain a Java keyword");
        assertTrue(!Ex2.hasKeyword("I love to breakdance"), "Expected 'I love to breakdance' not to contain any Java keyword");
    }
}
