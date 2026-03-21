package mid2.generic.ex5;

import mid2.generic.animal.Animal;
import mid2.generic.animal.Cat;
import mid2.generic.animal.Dog;

public class WildcardMain2 {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        //Animal 포함 상위 타입 전달 가능
        writeBox(objectBox);
        writeBox(animalBox);
        //writeBox(dogBox); //하한이 animal
        //writeBox(catBox); //하한이 animal
        Animal animal = animalBox.get();
        System.out.println("animal = " + animal);

    }

    static void writeBox(Box<? super Animal> box){
        box.set(new Dog("멍멍",100));
    }
}
