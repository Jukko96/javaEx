package start.poly.test.ex4;


public class InterfaceAnimalMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Caw caw = new Caw();
        Dog dog = new Dog();
        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(dog);
    }

    private static void soundAnimal(InterfaceAnimal interfaceAnimal){
        System.out.println("동물소리 테스트 시작");
        interfaceAnimal.sound();
        System.out.println("동물소리 테스트 종료");
    }
}
