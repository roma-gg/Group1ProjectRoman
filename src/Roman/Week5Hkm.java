package Roman;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Week5Hkm {

    public static String uniqueChars(String str) {
        var map = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            var ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        String result = "";
        for (var ch : map.keySet()) {
            if (map.get(ch) == 1)
                result += ch;
        }

        return result;
    }

    public static String reverseString(String str) {
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }

        return result;
    }
}
