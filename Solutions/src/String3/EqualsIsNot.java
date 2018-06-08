package String3;

public class EqualsIsNot {

    // Given a string, return true if the number of appearances of "is" anywhere in the string
    // is equal to the number of appearances of "not" anywhere in the string (case sensitive).

    // equalIsNot("This is not") → false
    // equalIsNot("This is notnot") → true
    // equalIsNot("noisxxnotyynotxisi") → true

    public boolean equalIsNot(String str) {
        int is = 0;
        int not = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.substring(i, i + 2).equals("is")) is += 1;
            if (i + 2 < str.length() && str.substring(i, i + 3).equals("not")) not += 1;
        }
        return is == not;
    }

}
