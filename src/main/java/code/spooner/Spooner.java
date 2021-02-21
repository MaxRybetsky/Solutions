package code.spooner;

public class Spooner {
    public String spoonerize(String words) {
        String[] s = words.split(" ");
        String res1 = s[1].charAt(0) + s[0].substring(1);
        String res2 = s[0].charAt(0) + s[1].substring(1);
        return res1 + " " + res2;
    }
}
