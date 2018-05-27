package Warmup2;

public class Count9 {

    // Given an array of ints, return the number of 9's in the array.

    // arrayCount9([1, 2, 9]) → 1
    // arrayCount9([1, 9, 9]) → 2
    // arrayCount9([1, 9, 9, 3, 9]) → 3

    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int n : nums) {
            if (n == 9)
                count++;
        }
        return count;
    }

}
