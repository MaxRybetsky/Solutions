package code.validphonenumber;

public class Kata {
    public static boolean validPhoneNumber(String phoneNumber) {
        if (phoneNumber.charAt(0) != '('
                || phoneNumber.charAt(4) != ')'
                || phoneNumber.charAt(5) != ' '
                || phoneNumber.charAt(9) != '-'
                || phoneNumber.length() != 14) {
            return false;
        }
        for (int i = 1; i < 14; i++) {
            if(i != 4 && i != 5 && i != 9) {
                int ch = phoneNumber.charAt(i);
                if(ch < 48 || ch > 57) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(validPhoneNumber("(123) 456-7890"));
    }
}
