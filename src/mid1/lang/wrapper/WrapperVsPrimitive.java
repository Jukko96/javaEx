package mid1.lang.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args) {
        int iterations = 1_000_000_000; //반복횟수, 10억
        long startTime, endTime;

        //기본형 long 사용
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumPrimitive += i;
        }

        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitiveValue  = " + sumPrimitive);
        System.out.println("primitive total ms  = " + (endTime - startTime));

        //래퍼 클래스 Long 사용


        //기본형 long 사용
        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumWrapper += i;
        }

        endTime = System.currentTimeMillis();
        System.out.println("sumWrapper  = " + sumWrapper);
        System.out.println("wrapper total ms  = " + (endTime - startTime));


    }
}
