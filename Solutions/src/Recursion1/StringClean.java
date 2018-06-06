package Recursion1;

public class StringClean {

    // Given a string, return recursively a "cleaned" string where adjacent chars that are
    // the same have been reduced to a single char. So "yyzzza" yields "yza".

    // stringClean("yyzzza") → "yza"
    // stringClean("abbbcdd") → "abcd"
    // stringClean("Hello") → "Helo"

    public String stringClean(String str) {
        if (str.length() <= 0) return "";
        if (str.length() == 1) return str;
        String s1 = str.substring(0, 1);
        String s2 = str.substring(1, 2);
        if (str.charAt(0) == str.charAt(1)) return stringClean(str.substring(1, str.length()));
        else return str.charAt(0) + stringClean(str.substring(1, str.length()));
    }

}
