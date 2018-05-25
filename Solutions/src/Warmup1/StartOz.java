package Warmup1;

public class StartOz {

    // Given a string, return a string made of the first 2 chars (if present), however include first char
    // only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".

    // startOz("ozymandias") → "oz"
    // startOz("bzoo") → "z"
    // startOz("oxx") → "o"

    public String startOz(String str) {
        String o = (str.length() > 0 && str.charAt(0) == 'o') ? "o" : "";
        String z = (str.length() > 1 && str.charAt(1) == 'z') ? "z" : "";
        return o + z;
    }

}
