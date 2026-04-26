package collection.test.ex5;

public enum Suit {
    SPADE("\u2660",1),
    DIAMOND("\u2666",2),
    HEART("\u2665",3),
    CLOBBER("\u2663",4);

    private final String icon;
    private final Integer rank;


    Suit(String icon, Integer rank) {
        this.icon = icon;
        this.rank = rank;
    }

    public Integer getRank() {
        return rank;
    }

    public String getIcon() {
        return icon;
    }
}
