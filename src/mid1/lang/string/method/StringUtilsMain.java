package mid1.lang.string.method;

public class StringUtilsMain {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        //valueOf 메서드
        String numString = String.valueOf(num);
        System.out.println("숫자의 문자열 값: "+ numString);
        String boolString = String.valueOf(bool);
        System.out.println("불리언의 문자열 값: "+ boolString);
        String objString = String.valueOf(obj);
        System.out.println("객체의 문자열 값: "+ objString);
        String strString = String.valueOf(str);
        System.out.println("문자의 문자열 값: "+ strString);

        String numString2 = ""+ num;
        System.out.println("숫자의 문자열 값2: "+ numString);

        char[] strToCharArray = str.toCharArray();
        System.out.println(strToCharArray);
        for (char c : strToCharArray){
            System.out.println("char: "+c);
        }
    }
}
