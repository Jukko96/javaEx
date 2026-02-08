package mid1.exception.ex4;


import mid1.exception.ex4.Exception.ConnectException;
import mid1.exception.ex4.Exception.NetworkClientExceptionV4;

public class NetworkServiceV4 {
    public void sendMessage (String message) {
        String address = "http://example.com";
        NetworkClientV4 client = new NetworkClientV4(address);

        client.initError(message);//추가
        try {
            client.connect();
            client.send(message);// throw new RuntimeException("ex");
        }finally {
            client.disconnect();
        }
    }
}
