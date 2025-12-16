package mid1.exception.basic.checked;

public class Client {
    public void call() throws  MyCheckedException{
        //문제 상황
        MyCheckedException ex = new MyCheckedException("에러당");
        throw ex;
    }
}
