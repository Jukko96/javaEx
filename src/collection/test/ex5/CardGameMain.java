package collection.test.ex5;

import java.util.List;

public class CardGameMain {
    public static void main(String[] args) {
        CardDeck cardDeck = new CardDeck();
        Player player1 = new Player("플레이어1");
        Player player2 = new Player("플레이어2");

        player1.deal(cardDeck);
        player2.deal(cardDeck);


        startGame(player1, player2);

    }

    private static void startGame(Player player1, Player player2) {
        player1.showHand();
        player2.showHand();

        Player winner = getWinner(player1, player2);

        if(winner == null){
            System.out.println("무승부");
        }else{
            System.out.println(winner.getName() + " 승리");
        }
    }

    private static Player getWinner(Player player1, Player player2) {
        Integer player1Score = player1.sumRank();
        Integer player2Score = player2.sumRank();

        if(player1Score > player2Score){
            return player1;
        }
        if(player1Score < player2Score){
            return player2;
        }
        return null;
    }


}
