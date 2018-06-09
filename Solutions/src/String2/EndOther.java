package String2;

public class EndOther {

    // Given two strings, return true if either of the strings appears at the very end of the other string,
    // ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
    // Note: str.toLowerCase() returns the lowercase version of a string.

    // endOther("Hiabc", "abc") → true
    // endOther("AbC", "HiaBc") → true
    // endOther("abc", "abXabc") → true

    public boolean endOther(String a, String b) {
        int alen = a.length();
        int blen = b.length();

        return (alen > blen) ? (a.substring(alen - blen, alen).equalsIgnoreCase(b))
                : (b.substring(blen - alen, blen).equalsIgnoreCase(a));

    }

}
