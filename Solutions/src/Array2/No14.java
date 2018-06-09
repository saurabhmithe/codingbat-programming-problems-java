package Array2;

public class No14 {

    // Given an array of ints, return true if it contains no 1's or it contains no 4's.

    // no14([1, 2, 3]) → true
    // no14([1, 2, 3, 4]) → false
    // no14([2, 3, 4]) → true

    public boolean no14(int[] nums) {
        boolean foundOne = false;
        boolean foundFour = false;
        for (int num : nums) {
            if (num == 1) foundOne = true;
            if (num == 4) foundFour = true;
        }
        return !(foundOne && foundFour);
    }

}
