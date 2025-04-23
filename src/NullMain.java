import test.InitData;

public class NullMain {
    public static void main(String[] args) {
        InitData data = null;
        null.value = 10; //nullPoinerException 발생
        System.out.println("data = "+data.value);
    }
}
