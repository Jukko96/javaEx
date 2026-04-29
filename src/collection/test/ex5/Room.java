package collection.test.ex5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Room {
    private Dealer dealer;
    private List<Player> players = new ArrayList<>();

    public Room(Dealer dealer) {
        this.dealer = dealer;
    }

    public void checkInPlayer(Player player){
        if(!players.contains(player)){
            players.add(player);
        }
    }

    public void checkOutPlayer(Player player){
        if(players.contains(player)){
            players.remove(player);
        }
    }
    public void startGame() {
        if(players.size() < 2){
            System.out.println("2명 이상 참여 시 시작 가능합니다.");
        }else{
//            System.out.println(dealer);
            for (Player player : players) {
                dealer.deal(player);
//                System.out.println(player);
            }
//            System.out.println(players);

            for (Player player : players) {
                player.showHand();
            }


            Player winner = getWinner();
            System.out.println(winner.getName() + "의 승");

            dealer.resetDeck();
            for (Player player : players) {
                player.removeHand();
            }
        }
    }

    private Player getWinner() {
        Player winner = players.get(0);
        for (Player player : players) {
            if(winner.sumRank() < player.sumRank()){
                winner = player;
            }else if(winner.sumRank() == player.sumRank()){
                Card winnerMaxCard = winner.getMaxCard();
                Card playerMaxCard = player.getMaxCard();
                if(playerMaxCard.compareTo(winnerMaxCard) > 0){
                    winner = player;
                }
            }
        }
        return winner;
    }
    public void debugGame(){
        Player player1 = new Player("디버깅1");
        Player player2 = new Player("디버깅2");
        ArrayList<Card> cards1 = new ArrayList<>();
        ArrayList<Card> cards2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Card card1 = new Card(Suit.CLOBBER,i+1);
            Card card2 = new Card(Suit.SPADE,i+1);

            cards1.add(card1);
            cards2.add(card2);
        }
        player1.setHand(cards1);
        player2.setHand(cards2);
        List<Player> debugPlayers = new ArrayList<>();
        debugPlayers.add(player1);
        debugPlayers.add(player2);

        Player winner = debugPlayers.get(0);
        for (Player player : debugPlayers) {
            if(winner.sumRank() < player.sumRank()){
                winner = player;
            }else if(winner.sumRank() == player.sumRank()){
                Card winnerMaxCard = winner.getMaxCard();
                Card playerMaxCard = player.getMaxCard();
                if(playerMaxCard.compareTo(winnerMaxCard) > 0){
                    winner = player;
                }
            }
        }
        for (Player player : debugPlayers) {
            player.showHand();
        }


        System.out.println(winner.getName() + "의 승");


    }
}
