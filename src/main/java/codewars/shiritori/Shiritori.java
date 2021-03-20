package codewars.shiritori;

import java.util.ArrayList;
import java.util.List;

public class Shiritori {
    public static List<String> theGame(List<String> words)
    {
        List<String> result = new ArrayList<>();
        StringBuilder buffer = new StringBuilder();
        for (String word : words) {
            if ("".equals(word)) {
                return result;
            }
            char start = word.charAt(0);
            char end = word.charAt(word.length() - 1);
            if (buffer.length() == 0) {
                buffer.append(end);
                result.add(word);
            } else if(start == buffer.charAt(0)) {
                buffer.deleteCharAt(0);
                result.add(word);
                buffer.append(end);
            } else {
                return result;
            }
        }
        return result;
    }
}
