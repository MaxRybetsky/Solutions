package codewars.trolls;

public class Troll {
    public static String disemvowel(String str) {
        return str.replaceAll("[aeoiuAEOIU]", "");
    }
}
