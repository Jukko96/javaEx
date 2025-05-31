package start.final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        //final 지역 변수
        final int data1;
        data1 = 10;
//        data1 = 20; // 컴파일 에러

        final int data2 = 10;
//        data2 = 10; //컴파일 에러
    }
    static void method(final int parameter){
//        parameter = 20; //컴파일 에러
    }
}
