package codewars.persistbugger;

class Persist {
    public static int persistence(long n) {
        if (n >= 0 && n <= 9) {
            return 0;
        }
        return persistence(countMultiOfDigit(n)) + 1;
    }

    private static long countMultiOfDigit(long n) {
        long multi = 1;
        while (n != 0) {
            multi *= n % 10;
            n /= 10;
        }
        return multi;
    }
}
