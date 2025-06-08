package mid1.lang.object.equals;

public class EqualsMain2 {
    public static void main(String[] args) {
        Dog2 dog1 = new Dog2("최부름");
        Dog2 dog2 = new Dog2("최부름");

        System.out.println("identity : " + (dog1 == dog2));
        System.out.println("equality : " + dog1.equals(dog2));

    }
}
