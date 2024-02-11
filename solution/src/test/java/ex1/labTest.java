package ex1;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class labTest {

    @Test
    void labTesting() {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(0);
        result.add(2);
        result.add(4);

        assertEquals(lab.ar(5), result);
    }
}


