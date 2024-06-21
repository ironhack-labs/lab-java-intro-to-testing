package Ironhack.schl;
public class OddIntegers {

    public int[] getOddIntegers(int n) {
        if (n < 0) {
            return new int[0];
        }

        int count = n / 2 + (n % 2 == 1 ? 1 : 0);
        int[] oddIntegers = new int[count];

        for (int i = 0; i < count; i++) {
            oddIntegers[i] = 2 * i + 1;
        }

        return oddIntegers;
    }
}
