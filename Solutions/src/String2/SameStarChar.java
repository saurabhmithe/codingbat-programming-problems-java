package String2;

public class SameStarChar {

    // Returns true if for every '*' (star) in the string,
    // if there are chars both immediately before and after the star,
    // they are the same.

    // sameStarChar("xy*yzz") → true
    // sameStarChar("xy*zzz") → false
    // sameStarChar("*xa*az") → true

    public boolean sameStarChar(String str) {
        boolean result = true;
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) == '*') {
                if (i - 1 >= 0 && i + 1 < str.length() && str.charAt(i - 1) != str.charAt(i + 1)) {
                    result = false;
                    break;
                }
            }
            i += 1;
        }
        return result;
    }

}
