package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        //final 필드 - 생성자로 초기화
        System.out.println("생성자 초기화");
        ConstructorInit constructorFiled1 = new ConstructorInit(10);
        ConstructorInit constructorFiled2 = new ConstructorInit(20);

        System.out.println("constructorFiled1.value = " + constructorFiled1.value);
        System.out.println("constructorFiled2.value = " + constructorFiled2.value);

        //final 필드 - 필드 초기화
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println("fieldInit1.value = "+ fieldInit1.value);
        System.out.println("fieldInit2.value = "+ fieldInit2.value);
        System.out.println("fieldInit3.value = "+ fieldInit3.value);

        //상수
        System.out.println("상수");
        System.out.println("FieldInit.CONST_VALUE = "+FieldInit.CONST_VALUE);
    }
}
