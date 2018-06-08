package String3;

public class SameEnds {

    // Given a string, return the longest substring that appears at both the beginning and
    // end of the string without overlapping. For example, sameEnds("abXab") is "ab".

    // sameEnds("abXYab") → "ab"
    // sameEnds("xx") → "x"
    // sameEnds("xxx") → "x"

    public String sameEnds(String string) {
        String end = "";
        for (int i = 0; i < string.length() / 2; i++) {
            if (string.substring(0, i + 1).equals(string.substring(string.length() - 1 - i, string.length())))
                end = string.substring(0, i + 1);
        }
        return end;
    }

}
