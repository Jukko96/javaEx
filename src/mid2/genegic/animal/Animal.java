package mid2.genegic.animal;

public class Animal {
    String name;
    Integer size;

    public Animal(String name, Integer size) {
        this.name = name;
        this.size = size;
    }

    public String getName () {
        return this.name;
    }

    public Integer getSize (){
        return this.size;
    }

    public void sound() {
        System.out.println("동물 울음 소리");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
