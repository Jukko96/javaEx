package mid1.nested.local;

import java.lang.reflect.Field;

public class LocalOuterV5 {
    private int outInstanceVar = 3;

    public Printer process(int paramVar){
        int localVar = 1; //지역 변수는 스텍 프레임이 종료되는 순간 함께 제거

        class LocalPrinter implements Printer{
            int value = 0;


            @Override
            public void print() {

                System.out.println("value = " + value);

                //인스턴스는 지역 변수보다 더 오래 살아남는다
                System.out.println("localVar = " + localVar);
//                localVar = localVar + 1; //이건 안됨 print()를 사용하지 않더라도 지역 클래스를 생성하는 시점에 캡쳐를 만들기 때문에 이미 암묵적 final로 인식
                System.out.println("localVar2 = " + localVar);
                System.out.println("paramVar = "+ paramVar);
                System.out.println("outInstanceVar = "+ outInstanceVar);
                System.out.println("outerClass = "+ this);
            }
        }

        LocalPrinter printer = new LocalPrinter();
//        printer.print();// 여기서 실행하지 않고 printer 인스턴스만 반환
//        만약 localVar를 변경한다면 다시 캡쳐해야하나??
//        localVar = 10;
//        paramVar = 10;
//        값의 변경이 필요하다면 변수 선언 후 사용하눈개 나음
        int x = localVar;
        x++;
        System.out.println("newValue = "+ x);
        return printer;


    }

    public static void main(String[] args) {
        LocalOuterV5 localOuter = new LocalOuterV5();
        Printer printer = localOuter.process(2);
//        printer.print()를 나중에 실행한다 process()의 스텍 프레임이 사라진 이후 실행
        printer.print();

        //추가
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field :" + field);
        }

    }
}
