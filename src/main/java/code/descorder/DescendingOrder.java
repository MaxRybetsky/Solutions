package code.descorder;

import java.util.Arrays;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        char[] chs = String.valueOf(num).toCharArray();
        Arrays.sort(chs);
        String s = new String(chs);
        StringBuilder s1 = new StringBuilder();
        for (int i = s.length() - 1; i >= 0 ; i--) {
            s1.append(s.charAt(i));
        }
        return Integer.parseInt(s1.toString());
    }
}
