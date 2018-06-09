package Array2;

public class Has77 {

    // Given an array of ints, return true if the array contains two 7's next to each other,
    // or there are two 7's separated by one element, such as with {7, 1, 7}.

    // has77([1, 7, 7]) → true
    // has77([1, 7, 1, 7]) → true
    // has77([1, 7, 1, 1, 7]) → false

    public boolean has77(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if ((i + 1 < nums.length && nums[i] == 7 && nums[i + 1] == 7)
                    || (i + 2 < nums.length && nums[i] == 7 && nums[i + 2] == 7)) return true;
        }
        return false;
    }

}
