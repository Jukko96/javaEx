package mid1.exception.ex3;


import mid1.exception.ex3.Exception.ConnectException;
import mid1.exception.ex3.Exception.NetworkClientExceptionV3;
import mid1.exception.ex3.Exception.SendExceptionV3;

public class NetworkServiceV3_2 {
    public void sendMessage (String message) {
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);

        client.initError(message);//추가
        try {
            client.connect();
            client.send(message);// throw new RuntimeException("ex");
        } catch (ConnectException e) {
            System.out.println("[연결오류] 주소 : " +e.getAddress() + ", 메세지 : "+e.getMessage());
        } catch (NetworkClientExceptionV3 e) {
            System.out.println("[네트워크 오류] 메세지 : "+e.getMessage());
        }catch (Exception e){
            System.out.println("[알 수 없는 오류] 메세지 : "+e.getMessage());
        }finally {
            client.disconnect();
        }
    }
}
