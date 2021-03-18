package code.bitsreverse;

public class BitsOfInteger {
    public static int reverse_bits(int n) {
        return Integer.parseInt(
                new StringBuilder(Integer.toBinaryString(n))
                        .reverse()
                        .toString(),
                2
        );
    }
}