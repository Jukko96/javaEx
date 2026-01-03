package mid1.exception.ex2;


import mid1.lang.NetworkClientExceptionV2;

public class NetworkServiceV2_2 {
    public void sendMessage (String message) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);

        client.initError(message);//추가
        try {
            client.connect();
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: "+e.getErrorCode() + ", 메세지 : "+e.getMessage());
            return;
        }
        try {
            client.send(message);
        } catch (NetworkClientExceptionV2 e) {

            System.out.println("[오류] 코드: "+e.getErrorCode() + ", 메세지 : "+e.getMessage());
            return;
        }
        client.disconnect();
    }
}
