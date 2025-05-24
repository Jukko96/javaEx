package poly.test.ex5;

public class SenderMain {
    public static void main(String[] args) {
        Sender [] senders = {new EmailSender(), new SmsSender(), new FaceSender()};
        for(Sender sender : senders){
            sender.sendMessage("환영합니다.");
        }
    }
}
