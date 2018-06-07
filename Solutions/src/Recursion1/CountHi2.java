package Recursion1;

public class CountHi2 {

    // Given a string, compute recursively the number of times lowercase "hi" appears in the string,
    // however do not count "hi" that have an 'x' immedately before them.

    // countHi2("ahixhi") → 1
    // countHi2("ahibhi") → 2
    // countHi2("xhixhi") → 0

    public int countHi2(String str) {
        if (str.length() <= 1) return 0;
        int count = 0;
        String tmp = str.substring(str.length() - 2, str.length());
        if (tmp.equals("hi")) {
            count = 1;
            if (str.length() - 3 >= 0 && str.substring(str.length() - 3, str.length() - 2).equals("x")) count = 0;
        }
        return count + countHi2(str.substring(0, str.length() - 1));
    }

}
