package collection.test.ex5;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card> hand = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Card> getDeck() {
        return hand;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
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
