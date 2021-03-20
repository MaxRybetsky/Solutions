package codewars.humantime;

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int n = 3600;
        StringBuilder res = new StringBuilder();
        while (n != 0) {
            int time = seconds / n;
            seconds %= n;
            n /= 60;
            res.append(suppleZeros(time))
                    .append(":");
        }
        return res.substring(0, res.length() - 1);
    }

    private static String suppleZeros(int number) {
        return String.format("%02d",number);
    }
}
