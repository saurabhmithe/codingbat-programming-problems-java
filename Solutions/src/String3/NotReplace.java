package String3;

public class NotReplace {

    // Given a string, return a string where every appearance of the lowercase word "is"
    // has been replaced with "is not". The word "is" should not be immediately preceeded
    // or followed by a letter -- so for example the "is" in "this" does not count.
    // (Note: Character.isLetter(char) tests if a char is a letter.)

    // notReplace("is test") → "is not test"
    // notReplace("is-is") → "is not-is not"
    // notReplace("This is right") → "This is not right"

    public String notReplace(String str) {
        String result = "";
        int i = 0;
        while (i < str.length()) {
            if (i + 2 <= str.length() && str.substring(i, i + 2).equals("is")) {
                boolean leftClear = true;
                boolean rightClear = true;
                if (i - 1 >= 0 && Character.isLetter(str.charAt(i - 1))) leftClear = false;
                if (i + 2 < str.length() && Character.isLetter(str.charAt(i + 2))) rightClear = false;
                if (leftClear && rightClear) {
                    result += "is not";
                } else {
                    result += "is";
                }
                i += 2;
            } else {
                result += str.charAt(i);
                i += 1;
            }
        }
        return result;
    }

}
