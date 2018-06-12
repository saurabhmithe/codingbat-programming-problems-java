package AP1;

public class WordsWithout {

    // Given an array of strings, return a new array without the strings that are equal to the target string.
    // One approach is to count the occurrences of the target string, make a new array of the correct length,
    // and then copy over the correct strings.

    // wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
    // wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
    // wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]

    public String[] wordsWithout(String[] words, String target) {
        int size = 0;
        for (String word : words) {
            if (!word.equals(target)) size += 1;
        }
        int index = 0;
        String[] array = new String[size];
        for (String word : words) {
            if (!word.equals(target) && index < size) array[index++] = word;
        }
        return array;
    }

}
