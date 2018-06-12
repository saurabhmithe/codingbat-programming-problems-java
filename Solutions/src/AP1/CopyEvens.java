package AP1;

public class CopyEvens {

    // Given an array of positive ints, return a new array of length "count" containing the first even
    // numbers from the original array. The original array will contain at least "count" even numbers.

    // copyEvens([3, 2, 4, 5, 8], 2) → [2, 4]
    // copyEvens([3, 2, 4, 5, 8], 3) → [2, 4, 8]
    // copyEvens([6, 1, 2, 4, 5, 8], 3) → [6, 2, 4]

    public int[] copyEvens(int[] nums, int count) {
        int[] array = new int[count];
        int index = 0;
        for (int num : nums) {
            if (num % 2 == 0 && index < count) array[index++] = num;
        }
        return array;
    }

}
