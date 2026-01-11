package mid1.exception.ex3;


import mid1.exception.ex3.Exception.ConnectException;
import mid1.exception.ex3.Exception.SendExceptionV3;

public class NetworkClientV3 {
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV3(String address) {
        this.address = address;
    }

    public void connect () throws ConnectException {
        if(connectError){
            throw new ConnectException(address, address + "서버 연결 실패");
        }
    }
    public void send (String data) throws SendExceptionV3 {
        if(sendError){
            throw new SendExceptionV3(data, address + "서버 연결 실패: "+data);
            //중간에 다른 에러가 났다고 가정
//            throw new RuntimeException("ex");
        }
        System.out.println(address + "서버에 데이터 전송 : " + data);
    }
    public void disconnect(){
        System.out.println(address + " 서버 연결 해제");
    }
    public void initError(String data){
        if(data.contains("error1")){
            connectError = true;
        }
        if(data.contains("error2")){
            sendError = true;
        }


    }
}
