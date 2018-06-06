package Recursion1;

public class CountHi {

    // Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.

    // countHi("xxhixx") → 1
    // countHi("xhixhix") → 2
    // countHi("hi") → 1

    public int countHi(String str) {
        if (str.length() <= 1) return 0;
        String tmp = str.substring(str.length() - 2, str.length());
        int count = 0;
        if (tmp.equals("hi")) count = 1;
        return count + countHi(str.substring(0, str.length() - 1));
    }

}
