package static1.test;

public class Car {

    private static int totalCars;
    private String name;
    Car(String name){
        System.out.println("차량구매 : "+ name);
        this.name = name;
        totalCars++;
    }

    public static void  showTotalCars(){
        System.out.println("totalCars = "+ totalCars);
    }
}
