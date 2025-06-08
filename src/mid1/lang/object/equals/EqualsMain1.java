package mid1.lang.object.equals;

public class EqualsMain1 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("최부름",6);
        Dog dog2 = new Dog("최부름",6);
        Dog dog3 = dog2;
        Dog dog4 = new Dog("박레오",3);

        System.out.println("dog1 dog2 비교");
        System.out.println(dog1==dog2);
        System.out.println("dog2 dog3 비교");
        System.out.println(dog2==dog3);

        dog2.printInfo();
        dog3.printInfo();

        dog2.setName("최레오");

        dog2.printInfo();
        dog3.printInfo();


    }
}
