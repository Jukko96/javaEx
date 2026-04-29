package collection.test.ex5;


public class CardGameMain {
    public static void main(String[] args) {
        CardDeck cardDeck = new CardDeck();
        Dealer dealer = new Dealer(cardDeck);
        Room room = new Room(dealer);

        Player player1 = new Player("플레이어1");
        Player player2 = new Player("플레이어2");
        Player player3 = new Player("플레이어3");
        Player player4 = new Player("플레이어4");

        room.checkInPlayer(player1);
        room.checkInPlayer(player2);

        room.startGame();

        room.checkInPlayer(player3);
        room.checkInPlayer(player4);
//        room.checkOutPlayer(player1);

        room.startGame();

//        room.debugGame();

    }



}
