package exercise1;

public class Ex1 {
    public static int[] getOddInts(int n) throws IllegalArgumentException {
        if (n < 1) {
            throw new IllegalArgumentException("the number must be greater than or equal to 1");
        }

        int[] oddNums = new int[(n + 1) / 2];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                oddNums[index] = i;
                index++;
            }
        }

        return oddNums;
    }
}