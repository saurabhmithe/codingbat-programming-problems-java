package Array3;

public class LinearIn {

    // Given two arrays of ints sorted in increasing order, outer and inner,
    // return true if all of the numbers in inner appear in outer.
    // The best solution makes only a single "linear" pass of both arrays,
    // taking advantage of the fact that both arrays are already in sorted order.

    // linearIn([1, 2, 4, 6], [2, 4]) → true
    // linearIn([1, 2, 4, 6], [2, 3, 4]) → false
    // linearIn([1, 2, 4, 4, 6], [2, 4]) → true

    public boolean linearIn(int[] outer, int[] inner) {
        if (inner.length == 0) return true;
        int innerPtr = 0;
        int outerPtr = 0;
        while (outerPtr < outer.length) {
            if (outer[outerPtr] == inner[innerPtr]) {
                innerPtr += 1;
                if (innerPtr == inner.length) return true;
            }
            outerPtr += 1;
        }
        return false;
    }

}
