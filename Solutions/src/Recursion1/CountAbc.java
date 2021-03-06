package Recursion1;

public class CountAbc {

    // Count recursively the total number of "abc" and "aba" substrings that appear in the given string.

    // countAbc("abc") → 1
    // countAbc("abcxxabc") → 2
    // countAbc("abaxxaba") → 2

    public int countAbc(String str) {
        if (str.length() <= 2) return 0;
        int count = 0;
        if (str.substring(0, 3).equals("abc") || str.substring(0, 3).equals("aba")) count = 1;
        return count + countAbc(str.substring(1, str.length()));
    }

}
