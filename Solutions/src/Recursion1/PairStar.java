package Recursion1;

public class PairStar {

    // Given a string, compute recursively a new string where identical chars that are
    // adjacent in the original string are separated from each other by a "*".

    // pairStar("hello") → "hel*lo"
    // pairStar("xxyy") → "x*xy*y"
    // pairStar("aaaa") → "a*a*a*a"

    public String pairStar(String str) {
        if (str.length() <= 0) return "";
        if (str.length() == 1) return str;
        String s1 = str.substring(0, 1);
        String s2 = str.substring(1, 2);
        if (s1.equals(s2)) return s1 + "*" + pairStar(str.substring(1, str.length()));
        else return s1 + pairStar(str.substring(1, str.length()));
    }

}
