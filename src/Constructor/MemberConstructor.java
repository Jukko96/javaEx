package Constructor;

public class MemberConstructor {
    String name;
    int age;
    int grade;

    MemberConstructor(String name, int age){
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
//        System.out.println("생성자 실행 이름: "+ this.name+" 나이:" +this.age + " 점수: "+this.grade);
        this(name,age,50); //변경

    }
    MemberConstructor(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
        System.out.println("생성자 실행 이름: "+ this.name+" 나이:" +this.age + " 점수: "+this.grade);
    }
}
