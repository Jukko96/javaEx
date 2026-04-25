package collection.test.ex5;

import java.util.Objects;

public class Card {
    private CardSuit suit;
    private Integer number;

    public Card(CardSuit suit, Integer number) {
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

}
