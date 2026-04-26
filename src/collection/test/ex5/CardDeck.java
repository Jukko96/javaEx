package collection.test.ex5;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CardDeck implements Comparator<Card> {
    private List<Card> Deck;
    private Integer DRAWSIZE = 5;


    public CardDeck() {
        this.Deck = new ArrayList<>();

        for (Suit suit : Suit.values()) {

            for (int i = 1; i <= 13; i++) {
                Deck.add(new Card(suit, i));
            }
        }
        Collections.shuffle(Deck);
    }

    public List<Card> deal (){
        System.out.println();
        if(Deck.size() > DRAWSIZE){
            List<Card> part = new ArrayList(Deck.subList(0, DRAWSIZE));
            Deck.subList(0,DRAWSIZE).clear();
            Collections.sort(part, this);
            return part;
        }

        System.out.println("카드가 모자랍니다.");
        return new ArrayList<>();
    }

    @Override
    public int compare(Card card1, Card card2) {
        Integer card1Number = card1.getNumber();
        Integer card2Number = card2.getNumber();
        if(card1Number == card2Number){
            Integer card1SuitRate = card1.getSuit().getRank();
            Integer card2SuitRate = card1.getSuit().getRank();
            if(card1SuitRate < card2SuitRate){
                return 1;
            }
            if(card1SuitRate > card2SuitRate){
                return -1;
            }
            return 0;

        }
        if(card1Number > card2Number){
            return 1;
        }
        if(card1Number < card2Number){
            return -1;
        }
        return 0;


    }
}
