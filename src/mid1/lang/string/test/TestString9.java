package mid1.lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        //email의 id와 domain부분을 분리하라
        String str = "id@domain.com";


//        System.out.println("id : " + str.split("@")[0]);
//        System.out.println("domain : " + str.split("@")[1]);

        String [] parts = str.split("@");
        String id = parts[0];
        String domain = parts[1];

        System.out.println("id : " + id);
        System.out.println("domain : " + domain);
    }
}
