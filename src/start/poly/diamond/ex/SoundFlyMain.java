package start.poly.diamond.ex;


public class SoundFlyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();
//        dog.sound();
//        dog.move();
//
//        bird.fly();
//        bird.move();
//        bird.fly();
//
//        chicken.fly();azh96ci490
//        chicken.move();
//        chicken.fly();
        soundAnimal(dog);
        soundAnimal(bird);
        soundAnimal(chicken);

        flyAnimal(dog);
        flyAnimal(bird);
        flyAnimal(chicken);
    }
    //AbstractAnimal 사용가능
    private static void soundAnimal(AbstractAnimal abstractAnimal){
        System.out.println("동물소리 테스트 시작");
        abstractAnimal.sound();
        System.out.println("동물소리 테스트 종료");
    }

    //fly 인터페이스가 있으면 사용 가능한 함수
    private static void flyAnimal(AbstractAnimal abstractAnimal){
        if(abstractAnimal instanceof Fly fly){
            fly.fly();
        }else{
            System.out.println("fly 없음");
        }
    }
}
