package mid1.exception.ex4;


public class NetworkServiceV5 {
    public void sendMessage (String message) {
        String address = "http://example.com";
//        NetworkClientV4 client = new NetworkClientV4(address);

        try (NetworkClientV5 client = new NetworkClientV5(address)){
            client.initError(message);//추가
            client.connect();
            client.send(message);// throw new RuntimeException("ex");
        }catch (Exception e){
            System.out.println("[예외확인] : "+e.getMessage());
            throw e;
        }
    }
}
