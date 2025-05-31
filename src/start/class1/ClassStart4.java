package start.class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1;

        student1 = new Student();
        student1.name = "학생1";
        student1.age = 20;
        student1.grade = 90;
        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 22;
        student2.grade = 80;
        Student[] students = {student1,student2};
        for(Student s : students ){
            System.out.println("이름: "+ s.name + " 나이:"+ s.age + " 점수"+ s.grade);

        }
    }
}
