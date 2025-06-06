package mid1.lang.object.Poly;

public class ObjectPolyEx1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

    }
    private static void action(Object object){
//        object.sound();
//        object.move();
        if(object instanceof Dog dog){
            dog.sound();
        }
        if(object instanceof Car car){
            car.move();
        }
    }
}
