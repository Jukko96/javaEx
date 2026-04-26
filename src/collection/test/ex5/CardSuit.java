package collection.test.ex5;

public class CardSuit {
    public static final CardSuit SPADE = new CardSuit("\u2660");
    public static final CardSuit DIAMOND = new CardSuit("\u2666");
    public static final CardSuit HEART = new CardSuit("\u2665");
    public static final CardSuit CLOBBER = new CardSuit("\u2663");
    public final String strCode;
    public CardSuit(String strCode) {
        this.strCode = strCode;
    }

    @Override
    public String toString() {
        return strCode;
    }
}
