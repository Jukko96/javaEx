package mid1.exception.ex4;


import mid1.exception.ex4.Exception.ConnectException;
import mid1.exception.ex4.Exception.SendExceptionV4;

public class NetworkClientV5 implements AutoCloseable{
    private final String address;
    public boolean connectError;
    public boolean sendError;
    public boolean runtimeError;

    public NetworkClientV5(String address) {
        this.address = address;
    }

    public void connect ()  {
        if(connectError){
            throw new ConnectException(address, address + "서버 연결 실패");
        }
    }
    public void send (String data) {
        if(sendError){
            throw new SendExceptionV4(data, address + "서버 연결 실패: "+data);
        }
        if(runtimeError){
            throw new RuntimeException("ex");
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
        if(data.contains("error3")){
            runtimeError = true;
        }
    }

    @Override
    public void close() {
        System.out.println("NetworkClientV5.close");
        disconnect();
    }
}
