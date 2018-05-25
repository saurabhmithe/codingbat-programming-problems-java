package Warmup1;

public class PosNeg {

    // Given 2 int values, return true if one is negative and one is positive.
    // Except if the parameter "negative" is true, then return true only if both are negative.

    // posNeg(1, -1, false) → true
    // posNeg(-1, 1, false) → true
    // posNeg(-4, -5, true) → true

    public boolean posNeg(int a, int b, boolean negative) {
        return !negative ? a * b < 0 : a + b < 0;
    }

}
