package code.guessingSequence;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class JomoPipi {
    static int[] sequence(int x) {
        AtomicInteger i = new AtomicInteger(1);
        int[] array = new int[x];
        return Arrays.stream(array)
                .map(elem -> elem = i.getAndIncrement())
                .mapToObj(String::valueOf)
                .sorted()
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
