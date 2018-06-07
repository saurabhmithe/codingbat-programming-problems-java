package Recursion1;

public class StrCount {

    // Given a string and a non-empty substring sub, compute recursively the number of
    // times that sub appears in the string, without the sub strings overlapping.

    // strCount("catcowcat", "cat") → 2
    // strCount("catcowcat", "cow") → 1
    // strCount("catcowcat", "dog") → 0

    public int strCount(String str, String sub) {
        if (str.length() < sub.length()) return 0;
        int jump = 1;
        int count = 0;
        if (str.substring(0, sub.length()).equals(sub)) {
            jump = sub.length();
            count = 1;
        }
        return count + strCount(str.substring(jump, str.length()), sub);
    }

}
