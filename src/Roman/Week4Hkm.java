package Roman;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Week4Hkm {
    public String freqOfChars(String str) {
        var map = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }

        String result = "";
        for (var ch : map.keySet()) {
            result += ch;
            result += map.get(ch);
        }

        return result;
    }

    public boolean sameLetters(String str1, String str2) {
        var set = new HashSet<Character>();
        for (int i = 0; i < str1.length(); i++) {
            set.add(str1.charAt(i));
        }

        for (int i = 0; i < str2.length(); i++) {
            if (!set.contains(str2.charAt(i)))
                return false;
            else
                set.remove(str2.charAt(i));
        }

        return set.isEmpty();
    }

    public String removeDuplicates(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains("" + str.charAt(i)))
                result += str.charAt(i);
        }

        return result;
    }
}
