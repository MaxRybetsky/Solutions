package codewars.positivetask;

import java.util.Arrays;

public class Positive {
    public static int sum(int[] arr) {
        return Arrays.stream(arr)
                .filter(e -> e > 0)
                .sum();
    }
}