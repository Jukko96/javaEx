package collection.test.ex5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Player {
    private String name;
    private List<Card> hand = new ArrayList<>();
    private Integer DRAWSIZE = 5;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Card> getDeck() {
        return hand;
    }

    public void deal (CardDeck CardDeck){
        List<Card> deck = CardDeck.getDeck();
        if(deck.size() > DRAWSIZE){
            List<Card> part = new ArrayList(deck.subList(0, DRAWSIZE));
            deck.subList(0,DRAWSIZE).clear();
            Collections.sort(part);
            hand = part;
        }else{
            System.out.println("카드가 모자랍니다.");
            hand = new ArrayList<>();

        }
    }

    public Integer sumRank(){
        Integer totalRank = 0;
        for (Card card : hand) {
            totalRank += card.getNumber();
        }
        return totalRank;
    }
    public void showHand(){
        hand.sort(null);
        System.out.println(name + "의 카드" + hand + ", 합계 : " + sumRank());
    }
}
