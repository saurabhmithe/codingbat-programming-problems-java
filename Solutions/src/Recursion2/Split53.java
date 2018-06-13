package Recursion2;

public class Split53 {

    // Given an array of ints, is it possible to divide the ints into two groups,
    // so that the sum of the two groups is the same, with these constraints: all
    // the values that are multiple of 5 must be in one group, and all the values
    // that are a multiple of 3 (and not a multiple of 5) must be in the other.
    // (No loops needed.)

    // split53([1, 1]) → true
    // split53([1, 1, 1]) → false
    // split53([2, 4, 2]) → true

    public boolean split53(int[] nums) {
        return rec(nums, 0, 0, 0);
    }

    public boolean rec(int[] nums, int index, int sum1, int sum2) {
        if (index >= nums.length) return sum1 == sum2;
        int value = nums[index];
        if (value % 3 == 0)
            return rec(nums, index + 1, sum1 + value, sum2);
        if (value % 5 == 0)
            return rec(nums, index + 1, sum1, sum2 + value);
        else return rec(nums, index + 1, sum1 + value, sum2)
                || rec(nums, index + 1, sum1, sum2 + value);
    }

}
