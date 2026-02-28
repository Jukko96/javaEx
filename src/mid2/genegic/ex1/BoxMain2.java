package mid2.genegic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
//        Object object = objectBox.get();
//        Integer integer = (Integer) object;

        Integer integer = (Integer) integerBox.get();
        System.out.println("integer : "+integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get();
        System.out.println("str : "+ str);


    }
}
