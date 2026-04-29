package collection.test.ex5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dealer {
    private String NAME = "딜러";
    private Integer DRAWSIZE = 5;
    private CardDeck deck;

    public Dealer(CardDeck deck) {
        this.deck = deck;
    }

    public void deal (Player player){
        if(deck.getDeckSize() < DRAWSIZE){
            resetDeck();
        }

        List<Card> cards = deck.getDeck();
        List<Card> part = new ArrayList(cards.subList(0, DRAWSIZE));
        cards.subList(0,DRAWSIZE).clear();
        Collections.sort(part);
        player.setHand(part);
//        player.showHand();
    }

    public void resetDeck() {
        this.deck = new CardDeck();
    }

    @Override
    public String toString() {
        return "Dealer{" +
                "deck=" + deck +
                '}';
    }
}
