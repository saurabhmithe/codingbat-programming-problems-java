package AP1;

public class WordsFront {

    // Given an array of strings, return a new array containing the first N strings.
    // N will be in the range 1..length.

    // wordsFront(["a", "b", "c", "d"], 1) → ["a"]
    // wordsFront(["a", "b", "c", "d"], 2) → ["a", "b"]
    // wordsFront(["a", "b", "c", "d"], 3) → ["a", "b", "c"]

    public String[] wordsFront(String[] words, int n) {
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = words[i];
        }
        return array;
    }

}