package Array1;

public class MaxTriple {

    // Given an array of ints of odd length, look at the first, last,
    // and middle values in the array and return the largest.
    // The array length will be a least 1.

    // maxTriple([1, 2, 3]) → 3
    // maxTriple([1, 5, 3]) → 5
    // maxTriple([5, 2, 3]) → 5

    public int maxTriple(int[] nums) {
        int a = nums[0];
        int b = nums[nums.length / 2];
        int c = nums[nums.length - 1];
        return a > b ? a > c ? a : c : c > b ? c : b;
    }

}
