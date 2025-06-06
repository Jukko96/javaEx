package mid1.lang.object.tostring;

public class ObjectPrint {
    public static void main(String[] args) {
        Dog dog1 = new Dog("개이름",10);
        Dog dog2 = new Dog("개2름",20);

        Car car = new Car("차이름");
        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        System.out.println("2. println의 toSting 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("3. ObjectPrinter 출력");

        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);


    }
}
