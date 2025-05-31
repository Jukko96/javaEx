package start.static1;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall(){
//        instanceValue++; // 인스턴스 변수에 접근 불가
//        instanceMethod(); //인스턴스 메소드 접근 불가
        staticValue++;//정적 변수에 접근
        staticMethod();//정적 메소드 접근

    }
    public void instanceCall(){
        instanceValue++; // 인스턴스 변수에 접근
        instanceMethod(); //인스턴스 메소드 접근
        staticValue++;//정적 변수에 접근
        staticMethod();//정적 메소드 접근
    }
    public static void staticCall(DecoData data){
        data.instanceValue++; // 인스턴스 변수에 접근
        data.instanceMethod(); //인스턴스 메소드 접근
    }
    private void instanceMethod(){
        System.out.println("instanceValue="+instanceValue);
    }
    private static void staticMethod(){
        System.out.println("staticValue="+staticValue);
    }
}
