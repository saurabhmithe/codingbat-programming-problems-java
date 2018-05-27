package Warmup2;

public class StringTimes {

    // Given a string and a non-negative int n, return a larger string that is n copies of the original string.

    // stringTimes("Hi", 2) → "HiHi"
    // stringTimes("Hi", 3) → "HiHiHi"
    // stringTimes("Hi", 1) → "Hi"

    public String stringTimes(String str, int n) {
        String result = "";
        while (n-- > 0)
            result += str;
        return result;
    }

}
