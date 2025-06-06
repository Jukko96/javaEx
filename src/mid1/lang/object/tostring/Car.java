package mid1.lang.object.tostring;

public class Car {
    private String carName;

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                '}';
    }

    Car(String carName){
        this.carName = carName;
    }
}
