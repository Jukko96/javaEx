package start.poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        //자식변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("child => child");
        System.out.println("value = "+ child.value);
        child.method();

        Parent parent = new Parent();
        System.out.println("parent => parent");
        System.out.println("value = "+ parent.value);
        parent.method();

        Parent poly = new Child();
        System.out.println("Parent => Child");
        System.out.println("value = "+poly.value);//변수는 오버라이딩 x
        poly.method();//메서드는 오버라이딩
    }
}
