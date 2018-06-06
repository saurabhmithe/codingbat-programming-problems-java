package Recursion1;

public class EndX {

    // Given a string, compute recursively a new string where all the
    // lowercase 'x' chars have been moved to the end of the string.

    // endX("xxre") → "rexx"
    // endX("xxhixx") → "hixxxx"
    // endX("xhixhix") → "hihixxx"

    public String endX(String str) {
        if (str.length() <= 0) return "";
        if (str.length() == 1) return str;
        String s = str.substring(0, 1);
        if (s.equals("x")) return endX(str.substring(1, str.length())) + s;
        else return s + endX(str.substring(1, str.length()));
    }

}
