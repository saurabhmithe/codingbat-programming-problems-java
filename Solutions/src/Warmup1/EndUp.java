package Warmup1;

public class EndUp {
    // Given a string, return a new string where the last 3 chars are now in upper case.
    // If the string has less than 3 chars, uppercase whatever is there.
    // Note that str.toUpperCase() returns the uppercase version of a string.

    // endUp("Hello") → "HeLLO"
    // endUp("hi there") → "hi thERE"
    // endUp("hi") → "HI"

    public String endUp(String str) {
        int len = str.length();
        return len > 2 ? str.substring(0, len - 3) + str.substring(len - 3, len).toUpperCase() : str.toUpperCase();
    }

}
