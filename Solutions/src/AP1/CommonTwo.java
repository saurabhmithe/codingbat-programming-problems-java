package AP1;

public class CommonTwo {

    // Start with two arrays of strings, a and b, each in alphabetical order,
    // possibly with duplicates. Return the count of the number of strings which
    // appear in both arrays. The best "linear" solution makes a single pass over
    // both arrays, taking advantage of the fact that they are in alphabetical order.

    // commonTwo(["a", "c", "x"], ["b", "c", "d", "x"]) → 2
    // commonTwo(["a", "c", "x"], ["a", "b", "c", "x", "z"]) → 3
    // commonTwo(["a", "b", "c"], ["a", "b", "c"]) → 3

    public int commonTwo(String[] a, String[] b) {
        int count = 0;
        int aPtr = 0;
        int bPtr = 0;
        String lastMatched = "";
        while (aPtr < a.length && bPtr < b.length) {
            if (a[aPtr].compareTo(b[bPtr]) == 0) {
                if (!a[aPtr].equals(lastMatched)) {
                    count += 1;
                    lastMatched = a[aPtr];
                }
                aPtr += 1;
                bPtr += 1;
            } else {
                if (a[aPtr].compareTo(b[bPtr]) < 0) aPtr += 1;
                else bPtr += 1;
            }
        }
        return count;
    }

}
