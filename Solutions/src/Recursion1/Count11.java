package Recursion1;

public class Count11 {

    // Given a string, compute recursively (no loops) the number of "11" substrings in the string.
    // The "11" substrings should not overlap.

    // count11("11abc11") → 2
    // count11("abc11x11x11") → 3
    // count11("111") → 1

    public int count11(String str) {
        if (str.length() <= 1) return 0;
        int jump = 1;
        int count = 0;
        if (str.substring(0, 2).equals("11")) {
            count = 1;
            jump = 2;
        }
        return count + count11(str.substring(jump, str.length()));
    }

}
