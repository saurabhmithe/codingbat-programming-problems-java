package Warmup1;

public class MissingChar {

    // Given a non-empty string and an int n, return a new string where the char at index n has been removed.
    // The value of n will be a valid index of a char in the original string
    // (i.e. n will be in the range 0..str.length()-1 inclusive).

    // missingChar("kitten", 1) → "ktten"
    // missingChar("kitten", 0) → "itten"
    // missingChar("kitten", 4) → "kittn"

    public String missingChar(String str, int n) {
        int len = str.length();
        return n == 0 ? str.substring(1, len) : str.substring(0, n) + str.substring(n + 1, len);
    }

}
