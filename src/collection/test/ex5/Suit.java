package collection.test.ex5;

public enum Suit {
    CLOBBER("\u2663"),
    HEART("\u2665"),
    DIAMOND("\u2666"),
    SPADE("\u2660");

    private final String icon;


    Suit(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }
}
