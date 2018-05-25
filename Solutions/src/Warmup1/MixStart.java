package Warmup1;

public class MixStart {
    // Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.

    // mixStart("mix snacks") → true
    // mixStart("pix snacks") → true
    // mixStart("piz snacks") → false

    public boolean mixStart(String str) {
        return str.length() > 2 && (str.charAt(1) == 'i' && str.charAt(2) == 'x');
    }

}
