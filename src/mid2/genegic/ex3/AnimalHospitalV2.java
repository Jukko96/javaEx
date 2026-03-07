package mid2.genegic.ex3;

public class AnimalHospitalV2<T> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }
    public void checkup (){
        //T의 타입을 정의하는 시점에는 알 수 없다. Object 의 기능만 사용 가능
//        System.out.println("동물의 이름 : "+ animal.getName());
//        System.out.println("동물의 크기 : "+ animal.getSize());
//        animal.sound();
    }

//    public T bigger (T target){
//        return animal.getSize() > target.getSize() ? animal : target;
//    }
}
