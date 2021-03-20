package codewars.lostnumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kata {
    public static int findDeletedNumber(int[] arr, int[] mixedArr) {
        List<Integer> res = new ArrayList<>();
        Arrays.stream(arr).forEach(
                el -> {
                    if(Arrays.stream(mixedArr).noneMatch(mel -> mel == el)) {
                        res.add(el);
                    }
                }
        );
        return res.size() == 0 ? 0 : res.get(0);
    }
}
