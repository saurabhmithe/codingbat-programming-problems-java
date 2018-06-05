package String2;

public class ZipZap {

    // Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
    // Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".

    // zipZap("zipXzap") → "zpXzp"
    // zipZap("zopzop") → "zpzp"
    // zipZap("zzzopzop") → "zzzpzp"

    public String zipZap(String str) {
        String result = "";
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) == 'z' && i + 2 < str.length() && str.charAt(i + 2) == 'p') {
                result = result + str.charAt(i) + str.charAt(i + 2);
                i += 3;
            } else {
                result += str.charAt(i);
                i += 1;
            }

        }
        return result;
    }

}
