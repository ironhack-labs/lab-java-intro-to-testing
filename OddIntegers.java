import java.util.ArrayList;
import java.util.List;

public class OddIntegers {

    public static int[] getOddIntegers(int n) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int i = 1; i <= n; i += 2) {
            oddNumbers.add(i);
        }
        return oddNumbers.stream().mapToInt(i -> i).toArray();
    }
}