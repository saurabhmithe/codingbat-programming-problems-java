package String2;

public class MixString {

    // Given two strings, a and b, create a bigger string made of the first char of a,
    // the first char of b, the second char of a, the second char of b, and so on.
    // Any leftover chars go at the end of the result.

    // mixString("abc", "xyz") → "axbycz"
    // mixString("Hi", "There") → "HTihere"
    // mixString("xxxx", "There") → "xTxhxexre"

    public String mixString(String a, String b) {
        String res = "";
        for (int i = 0, j = 0; i < a.length() || j < b.length(); i++, j++) {
            if (i < a.length()) res = res + a.charAt(i);
            if (j < b.length()) res = res + b.charAt(j);
        }
        return res;
    }

}
