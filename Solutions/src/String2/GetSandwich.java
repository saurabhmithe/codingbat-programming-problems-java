package String2;

public class GetSandwich {

    // A sandwich is two pieces of bread with something in between. Return the string
    // that is between the first and last appearance of "bread" in the given string,
    // or return the empty string "" if there are not two pieces of bread.

    // getSandwich("breadjambread") → "jam"
    // getSandwich("xxbreadjambreadyy") → "jam"
    // getSandwich("xxbreadyy") → ""

    public String getSandwich(String str) {
        String result = "";
        int i = 0;
        String bread = "bread";
        int start = 0;
        int end = 0;
        while (i < str.length() - bread.length()) {
            if (str.substring(i, i + bread.length()).equals(bread)) {
                start = i + bread.length();
                break;
            }
            i += 1;
        }
        i = str.length();
        while (i > bread.length()) {
            if (str.substring(i - bread.length(), i).equals(bread)) {
                end = i - bread.length();
                break;
            }
            i -= 1;
        }
        if (start < end) return str.substring(start, end);
        else return "";
    }

}
