package mid1.lang.string.test;

public class TestString4 {
    public static void main(String[] args) {
        // substring() 을 사용하여 hello 와 .txt 부분을 분리하라
        String str = "hello.txt";
        System.out.println("file name : " + str.substring(0,5));
        System.out.println("extension name : " + str.substring(5,9));
    }
}
