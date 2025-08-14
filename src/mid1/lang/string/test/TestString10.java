package mid1.lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        //split 을 사용하여 분리하고 join으로 재결합하라
        String str = "apple,banana,orange";
        String[] split = str.split(",");
        String joined = String.join("->",split);
        System.out.println(joined);
    }
}
