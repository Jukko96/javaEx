public class Casting {
    public static void main(String[] args) {
        int intValue = 10;
        double doubleValue = 10.5;
//        intValue = doubleValue; // 컴파일 에러
        intValue =(int) doubleValue;
        System.out.println(intValue);


        int maxIntValue = 2147483647;
        long overIntValue = 2147483648L;
        System.out.println((int) overIntValue); //초과 되는 값 강제 변환시 overflow 된 값 출력
    }
}
