package Logic2;

public class BlackJack {

    // Given 2 int values greater than 0, return whichever value is nearest to 21 without going over.
    // Return 0 if they both go over.

    // blackjack(19, 21) → 21
    // blackjack(21, 19) → 21
    // blackjack(19, 22) → 19

    public int blackjack(int a, int b) {
        int result = 0;
        if (21 - a < 0 && 21 - b < 0) return result;
        return 21 - a >= 0 && 21 - b >= 0 ? a > b ? a : b : 21 - a >= 0 ? a : b;
    }

}
