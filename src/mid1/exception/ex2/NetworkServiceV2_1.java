package mid1.exception.ex2;


import mid1.lang.NetworkClientExceptionV2;

public class NetworkServiceV2_1 {
    public void sendMessage (String message) throws NetworkClientExceptionV2 {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);

        client.initError(message);//추가
        client.connect();
        client.send(message);
        client.disconnect();
    }
}
