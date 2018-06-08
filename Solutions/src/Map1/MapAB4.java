package Map1;

import java.util.Map;

public class MapAB4 {

    // Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths,
    // then set "c" to have the longer value. If the values exist and have the same length,
    // change them both to the empty string in the map.

    // mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
    // mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
    // mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}

    public Map<String, String> mapAB4(Map<String, String> map) {
        int aLen = 0;
        int bLen = 0;
        if (map.containsKey("a") && map.containsKey("b")) {
            aLen = map.get("a").length();
            bLen = map.get("b").length();

            if (aLen == bLen) {
                map.put("a", "");
                map.put("b", "");
            } else {
                String value = aLen > bLen ? map.get("a") : map.get("b");
                map.put("c", value);
            }
        }
        return map;
    }

}
