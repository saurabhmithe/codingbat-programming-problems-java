package String3;

public class GHappy {

    // We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
    // Return true if all the g's in the given string are happy.

    // gHappy("xxggxx") → true
    // gHappy("xxgxx") → false
    // gHappy("xxggyygxx") → false

    public boolean gHappy(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                boolean left = true;
                boolean right = true;
                if ((i - 1 < 0) || (i - 1 >= 0 && str.charAt(i - 1) != 'g')) left = false;
                if ((i + 1 >= str.length()) || (i + 1 < str.length() && str.charAt(i + 1) != 'g')) right = false;
                if (!left && !right) return false;
            }
        }
        return true;
    }

}
