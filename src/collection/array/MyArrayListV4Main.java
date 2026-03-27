package collection.array;

public class MyArrayListV4Main {
    public static void main(String[] args) {

        MyArrayListV4<String> stringList = new MyArrayListV4();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
        System.out.println(stringList);

        String str1 = stringList.get(0);
        System.out.println("str1 = " + str1);

    }
}
