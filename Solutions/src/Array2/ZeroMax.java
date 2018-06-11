package Array2;

public class ZeroMax {

    // Return a version of the given array where each zero value in the array is
    // replaced by the largest odd value to the right of the zero in the array.
    // If there is no odd value to the right of the zero, leave the zero as a zero.

    // zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
    // zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
    // zeroMax([0, 1, 0]) → [1, 1, 0]

    public int[] zeroMax(int[] nums) {
        int[] array = new int[nums.length];
        int lastOdd = -1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] % 2 == 1) {
                if (nums[i] > lastOdd) lastOdd = nums[i];
            }
            if (lastOdd != -1) array[i] = lastOdd;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) nums[i] = array[i];
        }
        return nums;
    }

}
