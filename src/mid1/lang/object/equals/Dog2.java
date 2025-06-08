package mid1.lang.object.equals;

import java.util.Objects;

public class Dog2 {
    private String name;
    Dog2(String name){
        this.name = name;
    }
    public void printInfo(){
        System.out.println("이름 : "+ name );
    }
    public void setName (String name){
        this.name = name;
    }

//    @Override
//    public boolean equals(Object object) {
//        Dog2 dog2 = (Dog2) object;
//        return name.equals(dog2.name);
//    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Dog2 dog2 = (Dog2) object;
        return Objects.equals(name, dog2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
