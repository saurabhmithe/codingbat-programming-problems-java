package AP1;

import java.util.ArrayList;
import java.util.List;

public class WordsWithoutList {

    // Given an array of strings, return a new List (e.g. an ArrayList)
    // where all the strings of the given length are omitted.
    // See wordsWithout() below which is more difficult because it uses arrays.

    // wordsWithoutList(["a", "bb", "b", "ccc"], 1) → ["bb", "ccc"]
    // wordsWithoutList(["a", "bb", "b", "ccc"], 3) → ["a", "bb", "b"]
    // wordsWithoutList(["a", "bb", "b", "ccc"], 4) → ["a", "bb", "b", "ccc"]

    public List wordsWithoutList(String[] words, int len) {
        List<String> list = new ArrayList<String>();
        for (String word : words) {
            if (word.length() != len) list.add(word);
        }
        return list;
    }

}
