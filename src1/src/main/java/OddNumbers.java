public class OddNumbers {
    public static int[] getOddIntegers(int n) {
        if (n < 1) {
            return new int[0];
        }

        return java.util.stream.IntStream.rangeClosed(1, n)
                .filter(i -> i % 2 != 0)
                .toArray();
    }
}
