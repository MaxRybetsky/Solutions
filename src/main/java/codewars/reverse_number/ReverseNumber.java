package codewars.reverse_number;

public class ReverseNumber {
    public static int reverse(int number) {
        if (number == 0) {
            return 0;
        }
        boolean isNegative = number < 0;
        StringBuilder sb = new StringBuilder();
        sb.append(Math.abs(number));
        sb.reverse();
        while (sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        String res = sb.toString();
        if (isNegative) res = "-" + res;
        return Integer.parseInt(res);
    }
}
