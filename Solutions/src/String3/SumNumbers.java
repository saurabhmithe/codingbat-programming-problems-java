package String3;

public class SumNumbers {

    // Given a string, return the sum of the numbers appearing in the string, ignoring all other characters.
    // A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char
    // is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)

    // sumNumbers("abc123xyz") → 123
    // sumNumbers("aa11b33") → 44
    // sumNumbers("7 11") → 18

    public int sumNumbers(String str) {
        int sum = 0;
        String num = "";
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (Character.isDigit(current)) {
                num += current;
            } else {
                if (!num.equals("")) {
                    sum += Integer.parseInt(num);
                    num = "";
                }
            }
        }
        if (!num.equals("")) sum += Integer.parseInt(num);
        return sum;
    }

}
