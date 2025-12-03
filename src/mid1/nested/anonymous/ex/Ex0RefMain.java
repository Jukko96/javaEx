package mid1.nested.anonymous.ex;

public class Ex0RefMain {


    public static void Hello(String stack){
        System.out.println("프로그램 시작");
        System.out.println("Hello "+stack);
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        Hello("Java");
        Hello("Spring");
    }

}
