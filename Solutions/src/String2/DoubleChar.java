package String2;

public class DoubleChar {

    // Given a string, return a string where for every char in the original, there are two chars.

    // doubleChar("The") → "TThhee"
    // doubleChar("AAbb") → "AAAAbbbb"
    // doubleChar("Hi-There") → "HHii--TThheerree"

    public String doubleChar(String str) {
        String result = "";
        for (char c : str.toCharArray()) result += "" + c + c;
        return result;
    }

}
