package codewars.camelCase;

public class Kata {

    public static String camelCase(String camelCasing) {
        char[] srcChars = camelCasing.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char ch : srcChars) {
            if((int) ch >= 65 && (int) ch <= 90) {
                if(ch != srcChars[0]) {
                    sb.append(' ');
                }
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}
