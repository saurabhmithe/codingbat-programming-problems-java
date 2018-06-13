package Functional1;

import java.util.List;

public class NoX {

    // Given a list of strings, return a list where each string has all its "x" removed.

    // noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
    // noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
    // noX(["x"]) → [""]

    public List<String> noX(List<String> strings) {
        strings.replaceAll(s -> removeX(s));
        return strings;
    }

    public String removeX(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'x') result += s.charAt(i);
        }
        return result;
    }

}
