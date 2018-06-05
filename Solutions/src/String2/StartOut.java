package String2;

public class StartOut {

    // Return a version of the given string, where for every star (*) in the string the star and the chars
    // immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".

    // starOut("ab*cd") → "ad"
    // starOut("ab**cd") → "ad"
    // starOut("sm*eilly") → "silly"

    public String starOut(String str) {
        String result = "";
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) != '*') {
                if ((i - 1 >= 0 && str.charAt(i - 1) == '*') || (i + 1 < str.length() && str.charAt(i + 1) == '*')) {
                    i += 1;
                    continue;
                } else {
                    result += str.charAt(i);
                    i += 1;
                    continue;
                }
            } else {
                i += 2;
                continue;
            }
        }
        return result;
    }

}
