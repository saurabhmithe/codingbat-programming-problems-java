package Warmup1;

public class FrontBack {

    // Given a string, return a new string where the first and last chars have been exchanged.

    // frontBack("code") → "eodc"
    // frontBack("a") → "a"
    // frontBack("ab") → "ba"

    public String frontBack(String str) {
        int len = str.length();
        if (len > 1) {
            str = str.charAt(len - 1) + str.substring(1, len - 1) + str.charAt(0);
        }
        return str;
    }

}
