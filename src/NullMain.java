import test.InitData;

public class NullMain {
    public static void main(String[] args) {
        InitData data = new InitData();

        System.out.println("data.initInt = "+data.initInt);
        System.out.println("data.initString = "+data.initString);
        System.out.println("data.initObject = "+data.initObject);
        System.out.println("data.initObject.title = "+data.initObject.title);//여기서 nullPointerException 발생
    }
}
