package collection.test.ex5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Room {
    private Dealer dealer;
    private CardDeck cardDeck;
    private List<Player> players = new ArrayList<Player>();

    public Room(Dealer dealer, CardDeck cardDeck) {
        this.dealer = dealer;
        this.cardDeck = cardDeck;
    }

    public void CheckInPlayer(Player player){
        if(!players.contains(player)){
            players.add(player);
        }
    }

    public void CheckOutPlayer(Player player){
        if(players.contains(player)){
            players.remove(player);
        }
    }
    private void startGame() {
        if(players.size() < 2){
            System.out.println("2명 이상 참여 시 시작 가능합니다.");

        }else{
            for (Player player : players) {
                player.showHand();
            }


            Player winner = getWinner();

            if(winner == null){
                System.out.println("무승부");
            }else{
                System.out.println(winner.getName() + " 승리");
            }
        }
    }

    private Player getWinner() {
        return Collections.max(players.)
    }
}
