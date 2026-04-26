package collection.test.ex5;

import java.util.List;

public class CardGameMain {
    public static void main(String[] args) {
        CardDeck cardDeck = new CardDeck();
        List<Card> player1 = cardDeck.deal();
        List<Card> player2 = cardDeck.deal();

        startGame(player1, player2);

    }

    private static void startGame(List<Card> player1, List<Card> player2) {
        Integer player1Score = 0;
        Integer player2Score = 0;

        for (Card card : player1) {
            player1Score += card.getNumber();
        }
        for (Card card : player2) {
            player2Score += card.getNumber();
        }
        System.out.println("플레이어 1의 카드 : " + player1 + ", 합계 : " + player1Score );
        System.out.println("플레이어 2의 카드 : " + player2 + ", 합계 : " + player2Score);

        if(player1Score > player2Score){
            System.out.println("플레이어 1의 승리");
        }
        if(player1Score < player2Score){
            System.out.println("플레이어 2의 승리");
        }
        if(player1Score == player2Score){
            System.out.println("무승부");
        }
    }


}
