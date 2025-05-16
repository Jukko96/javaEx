package poly.test.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        Cat cat = new Cat();
//        Caw caw = new Caw();
        //        Animal[] animalArr = {dog,cat,caw};
        Animal[] animalArr = {new Dog(), new Cat(), new Caw()};

        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 울음소리 테스트 시작");
        animal.sound();
        System.out.println("동물 울음소리 테스트 종료");
    }
}
