package Recursion2;

public class SplitArray {

    // Given an array of ints, is it possible to divide the ints into two groups,
    // so that the sums of the two groups are the same. Every int must be in one
    // group or the other. Write a recursive helper method that takes whatever
    // arguments you like, and make the initial call to your recursive helper
    // from splitArray(). (No loops needed.)

    // splitArray([2, 2]) → true
    // splitArray([2, 3]) → false
    // splitArray([5, 2, 3]) → true

    public boolean splitArray(int[] nums) {
        return rec(nums, 0, 0, 0);
    }

    public boolean rec(int[] nums, int index, int sum1, int sum2) {
        if (index >= nums.length) return sum1 == sum2;
        int value = nums[index];
        return rec(nums, index + 1, sum1 + value, sum2) || rec(nums, index + 1, sum1, sum2 + value);
    }

}
