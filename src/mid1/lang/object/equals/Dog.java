package mid1.lang.object.equals;

public class Dog {
    private String name;
    private int age;
    Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void printInfo(){
        System.out.println("이름 : "+ name + " 나이 : "+ age);
    }
    public void setName (String name){
        this.name = name;
    }

}
