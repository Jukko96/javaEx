package mid2.generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenegicBox<Integer> integerBox = new GenegicBox<Integer>(); //생성 시점에 T의 타입이 결정
        integerBox.set(10);
        Integer intValue = integerBox.get();
        System.out.println("intValue : " + intValue);

        GenegicBox<String> stringBox = new GenegicBox<>();
        stringBox.set("hello");
        String strValue = stringBox.get();
        System.out.println("strValue : " + strValue);
    }
}
