package Array3;

public class SquareUp {

    // Given n>=0, create an array length n*n with the following pattern,
    // shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).

    // squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
    // squareUp(2) → [0, 1, 2, 1]
    // squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]

    public int[] squareUp(int n) {
        int[] array = new int[n * n];
        int index = 0;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if (j >= i) {
                    array[index] = n - j;
                }
                index += 1;
            }
        }
        return array;
    }

}
