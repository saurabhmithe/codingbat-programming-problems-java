package String3;

public class MaxBlock {

    // Given a string, return the length of the largest "block" in the string.
    // A block is a run of adjacent chars that are the same.

    // maxBlock("hoopla") → 2
    // maxBlock("abbCCCddBBBxx") → 3
    // maxBlock("") → 0

    public int maxBlock(String str) {
        int maxBlock = 0;
        int count = 1;
        if (str.length() == 0) return 0;
        char current = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == current) count += 1;
            else {
                current = str.charAt(i);
                count = 1;
            }
            if (count > maxBlock) maxBlock = count;
        }
        return maxBlock;
    }

}
