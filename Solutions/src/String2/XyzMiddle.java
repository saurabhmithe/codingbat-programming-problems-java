package String2;

public class XyzMiddle {

    // Given a string, does "xyz" appear in the middle of the string? To define middle,
    // we'll say that the number of chars to the left and right of the "xyz" must differ by at most one.
    // This problem is harder than it looks.

    // xyzMiddle("AAxyzBB") → true
    // xyzMiddle("AxyzBB") → true
    // xyzMiddle("AxyzBBB") → false

    public boolean xyzMiddle(String str) {
        if (!str.contains("xyz")) {
            return false;
        }
        int indexOfXyz = str.indexOf("xyz", str.length() / 2 - 2);
        int countLeft = 0;
        int countRight = 0;

        for (int i = 0; i < indexOfXyz; i++) {
            countLeft++;
        }
        for (int i = indexOfXyz + 3; i < str.length(); i++) {
            countRight++;
        }
        return !(Math.abs(countLeft - countRight) > 1);
    }

}
