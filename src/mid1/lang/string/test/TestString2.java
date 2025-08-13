package mid1.lang.string.test;

public class TestString2 {
    public static void main(String[] args) {
        //length()를 사용하여 String 배열안의 문자열 길이 합을 구하라
        String[] stringArray = {"java", "python", "c++", "dart"};
        int totalLength = 0;
        for (String string : stringArray) {
            totalLength += string.length();
        }

        System.out.println("total length = " + totalLength);
    }
}
