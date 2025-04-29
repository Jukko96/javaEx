package Constructor;

public class MemberConstructor {
    String name;
    int age;
    int grade;
    MemberConstructor(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
        System.out.println("생성자 실행 이름: "+ name+" 나이:" +age + " 점수: "+age);
    }
}
