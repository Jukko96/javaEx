package collection.test.ex5;

public enum Suit {
    SPADE(CardSuit.SPADE,1),
    DIAMOND(CardSuit.DIAMOND,2),
    HEART(CardSuit.HEART,3),
    CLOBBER(CardSuit.CLOBBER,4);

    private final CardSuit cardSuit;
    private final Integer rank;


    Suit(CardSuit cardSuit, Integer rank) {
        this.cardSuit = cardSuit;
        this.rank = rank;
    }

    public Integer getRank() {
        return rank;
    }

    public CardSuit getCardSuit() {
        return cardSuit;
    }
}
