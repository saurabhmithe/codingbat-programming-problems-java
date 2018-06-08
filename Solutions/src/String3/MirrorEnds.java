package String3;

public class MirrorEnds {

    // Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
    // In other words, zero or more characters at the very begining of the given string, and at the very end of the
    // string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".

    // mirrorEnds("abXYZba") → "ab"
    // mirrorEnds("abca") → "a"
    // mirrorEnds("aba") → "aba"

    public String mirrorEnds(String string) {
        String end = "";
        for (int i = 0; i < string.length(); i++) {
            if (string.substring(i, i + 1).equals(string.substring(string.length() - 1 - i, string.length() - i)))
                end += string.charAt(i);
            else break;
        }
        return end;
    }

}
