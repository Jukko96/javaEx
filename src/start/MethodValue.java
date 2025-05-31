package start;

public class MethodValue {
    public static void main(String[] args) {
        int num1 = 5;
//        int num2 = num1;
//        num1 += 10;
//        System.out.println("num1 = " +  num1);
//        System.out.println("num2 = " +  num2);

        System.out.println("변경 전 num1 = "+ num1);
        changeNumber(num1);
        System.out.println("변경 후 num1 = "+ num1);


    }
    public static void changeNumber(int num2){
        System.out.println("변경 전 num2 = "+ num2);
        num2 = num2 * 2;
        System.out.println("변경 후 num2 = "+ num2);
    }
}
