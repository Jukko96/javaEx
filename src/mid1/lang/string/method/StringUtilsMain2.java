package mid1.lang.string.method;

public class StringUtilsMain2 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        String str = "Hello, Java!";

        //format method
        String format1 = String.format("num: %d, bool: %b, str: %s", num,bool,str);
        System.out.println("format1:"+format1);

        String format2 = String.format("숫자 %.2f",2.123456);
        System.out.println("format2:"+format2);

        //printf
        System.out.printf("숫자: %.2f\n",1.234567);

    }
}
