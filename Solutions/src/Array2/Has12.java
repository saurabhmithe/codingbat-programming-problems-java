package Array2;

public class Has12 {

    // Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.

    // has12([1, 3, 2]) → true
    // has12([3, 1, 2]) → true
    // has12([3, 1, 4, 5, 2]) → true

    public boolean has12(int[] nums) {
        boolean foundOne = false;
        for (int num : nums) {
            if (num == 1) foundOne = true;
            if (foundOne && num == 2) return true;
        }
        return false;
    }

}
