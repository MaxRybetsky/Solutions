package code.pangram;

import java.util.HashSet;
import java.util.Set;

public class PangramChecker {
    public boolean check(String sentence) {
        Set<Character> set = new HashSet<>();
        sentence = sentence.toLowerCase();
        for (int i = 0; i < sentence.length(); i++) {
            int charCode = (int) sentence.charAt(i);
            if (charCode >= 97 && charCode <= 122) {
                set.add((char) charCode);
            }
        }
        return set.size() == 26;
    }
}
