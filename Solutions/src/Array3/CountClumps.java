package Array3;

public class CountClumps {

    // Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value.
    // Return the number of clumps in the given array.

    // countClumps([1, 2, 2, 3, 4, 4]) → 2
    // countClumps([1, 1, 2, 1, 1]) → 2
    // countClumps([1, 1, 1, 1, 1]) → 1

    public int countClumps(int[] nums) {
        int count = 0;
        boolean newValue = true;
        int current = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == current) {
                if (newValue) count += 1;
                newValue = false;
            } else {
                current = nums[i];
                newValue = true;
            }
        }
        return count;
    }

}
