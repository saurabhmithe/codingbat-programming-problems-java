package Recursion1;

public class ChangePi {

    // Given a string, compute recursively (no loops) a new string where
    // all appearances of "pi" have been replaced by "3.14".

    // changePi("xpix") → "x3.14x"
    // changePi("pipi") → "3.143.14"
    // changePi("pip") → "3.14p"

    public String changePi(String str) {
        if (str.length() <= 1) return str;
        String tmp = str.substring(0, 1);
        int jump = 1;
        if (str.substring(0, 2).equals("pi")) {
            tmp = "3.14";
            jump = 2;
        }
        return tmp + changePi(str.substring(jump, str.length()));
    }

}
