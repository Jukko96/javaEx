package mid1.exception.ex2;


import mid1.lang.NetworkClientExceptionV2;

public class NetworkServiceV2_5 {
    public void sendMessage (String message) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);

        client.initError(message);//추가
        try {
            client.connect();
            client.send(message);// throw new RuntimeException("ex");
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: "+e.getErrorCode() + ", 메세지 : "+e.getMessage());
        }finally {
            client.disconnect();
        }
    }
}
