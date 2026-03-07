package mid2.genegic.animal;

public class Cat extends Animal{
    public Cat(String name, Integer size) {
        super(name, size);
    }

    @Override
    public void sound() {
        System.out.println("야옹");
    }
}
