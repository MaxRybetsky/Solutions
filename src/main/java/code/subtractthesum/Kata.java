package code.subtractthesum;

public class Kata {
    public static String subtractSum (int n) {
        if(n > 99) {
            return getFruit(99);
        }
        return getFruit(numberCalc(n));
    }

    public static int numberCalc(int n) {
        do {
            n -= digitsSum(n);
        } while(n > 100);
        return n;
    }

    public static int digitsSum(int n) {
        int sum = 0;
        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    private static String getFruit(int n) {
        String[] fruits = {
                "no",
                "kiwi",
                "pear",
                "kiwi",
                "banana",
                "melon",
                "banana",
                "melon",
                "pineapple",
                "apple",
                "pineapple",
                "cucumber",
                "pineapple",
                "cucumber",
                "orange",
                "grape",
                "orange",
                "grape",
                "apple",
                "grape",
                "cherry",
                "pear",
                "cherry",
                "pear",
                "kiwi",
                "banana",
                "kiwi",
                "apple",
                "melon",
                "banana",
                "melon",
                "pineapple",
                "melon",
                "pineapple",
                "cucumber",
                "orange",
                "apple",
                "orange",
                "grape",
                "orange",
                "grape",
                "cherry",
                "pear",
                "cherry",
                "pear",
                "apple",
                "pear",
                "kiwi",
                "banana",
                "kiwi",
                "banana",
                "melon",
                "pineapple",
                "melon",
                "apple",
                "cucumber",
                "pineapple",
                "cucumber",
                "orange",
                "cucumber",
                "orange",
                "grape",
                "cherry",
                "apple",
                "cherry",
                "pear",
                "cherry",
                "pear",
                "kiwi",
                "pear",
                "kiwi",
                "banana",
                "apple",
                "banana",
                "melon",
                "pineapple",
                "melon",
                "pineapple",
                "cucumber",
                "pineapple",
                "cucumber",
                "apple",
                "grape",
                "orange",
                "grape",
                "cherry",
                "grape",
                "cherry",
                "pear",
                "cherry",
                "apple",
                "kiwi",
                "banana",
                "kiwi",
                "banana",
                "melon",
                "banana",
                "melon",
                "pineapple",
                "apple",
                "pineapple"
        };
        return fruits[n];
    }
}