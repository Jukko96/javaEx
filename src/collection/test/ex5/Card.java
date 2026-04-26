package collection.test.ex5;

import java.util.Objects;

public class Card {
    private Suit suit;
    private Integer number;

    public Card(Suit suit, Integer number) {
        this.suit = suit;
        this.number = number;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Card card = (Card) object;
        return Objects.equals(suit, card.suit) && Objects.equals(number, card.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, number);
    }

    public Suit getSuit() {
        return suit;
    }

    public Integer getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return number + "(" + suit.getIcon() + ")";
    }
}
