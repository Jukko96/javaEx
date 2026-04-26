package collection.test.ex5;

public enum Suit {
    SPADE("\u2660"),
    DIAMOND("\u2666"),
    HEART("\u2665"),
    CLOBBER("\u2663");

    private final String icon;


    Suit(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }
}
