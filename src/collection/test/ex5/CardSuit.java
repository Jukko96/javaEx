package collection.test.ex5;

public class CardSuit {
    private static final CardSuit SPADE = new CardSuit("\u2660");
    private static final CardSuit HEART = new CardSuit("\u2665");
    private static final CardSuit DIAMOND = new CardSuit("\u2666");
    private static final CardSuit CLOBBER = new CardSuit("\u2663");
    private final String strCode;
    public CardSuit(String strCode) {
        this.strCode = strCode;
    }
}
