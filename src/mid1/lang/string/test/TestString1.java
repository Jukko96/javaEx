package mid1.lang.string.test;

public class TestString1 {
    public static void main(String[] args) {
        //startWith() 를 사용해서 url이 https://로 시작하는지 확인
        String url1= "https://www.example.com";
        String url2 = "http://localhost:3000";

        System.out.println("url1 : " +url1.startsWith("https://"));
        System.out.println("url2 : " +url2.startsWith("https://"));
    }
}
