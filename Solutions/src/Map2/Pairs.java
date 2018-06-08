package Map2;

import java.util.HashMap;
import java.util.Map;

public class Pairs {

    // Given an array of non-empty strings, create and return a Map<String, String> as follows:
    // for each string add its first character as a key with its last character as the value.

    // pairs(["code", "bug"]) → {"b": "g", "c": "e"}
    // pairs(["man", "moon", "main"]) → {"m": "n"}
    // pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}

    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<String, String>();
        for (String str : strings) {
            map.put(str.charAt(0) + "", str.charAt(str.length() - 1) + "");
        }
        return map;
    }

}
