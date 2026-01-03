package mid1.lang;

public class NetworkClientExceptionV2 extends Exception {

    private String errorCode;

    public NetworkClientExceptionV2(String errorCode, String message) {
        super(message);
        errorCode = errorCode;
    }

    public String getErrorCode(){
        return errorCode;
    }
}
