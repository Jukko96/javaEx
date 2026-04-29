package collection.test.ex5;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDeck  {
    private List<Card> Deck;


    public CardDeck() {
        initCard();
        shuffle();
    }

    private void shuffle() {
        Collections.shuffle(Deck);
    }

    private void initCard() {
        this.Deck = new ArrayList<>();

        for (Suit suit : Suit.values()) {
            for (int i = 1; i <= 13; i++) {
                Deck.add(new Card(suit, i));
            }
        }
    }

    public List<Card> getDeck() {
        return Deck;
    }

    public  Integer getDeckSize(){
        return Deck.size();
    }

    @Override
    public String toString() {
        return "CardDeck{" +
                "Deck=" + Deck +
                '}';
    }
}
