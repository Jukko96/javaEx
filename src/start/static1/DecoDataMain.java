package start.static1;

import static start.static1.DecoData.*; //import static 을 사용해서 클래스 메소드 호출 가능

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적호출");
        staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData decoData1 = new DecoData();
        decoData1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData decoData2 = new DecoData();
        decoData2.instanceCall();

        DecoData decoData = new DecoData();
//        decoData.staticCall(); //실행은 가능하지만 시맨틱적을 좋지 않음
        staticCall();
    }
}
