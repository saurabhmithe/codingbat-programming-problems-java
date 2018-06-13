package Recursion2;

public class GroupSum6 {

    // Given an array of ints, is it possible to choose a group of some of the ints,
    // beginning at the start index, such that the group sums to the given target?
    // However, with the additional constraint that all 6's must be chosen.
    // (No loops needed.)

    // groupSum6(0, [5, 6, 2], 8) → true
    // groupSum6(0, [5, 6, 2], 9) → false
    // groupSum6(0, [5, 6, 2], 7) → false

    public boolean groupSum6(int start, int[] nums, int target) {
        if (start >= nums.length) return target == 0;
        int value = nums[start];
        if (value == 6) return groupSum6(start + 1, nums, target - value);
        return groupSum6(start + 1, nums, target - value) || groupSum6(start + 1, nums, target);
    }

}
