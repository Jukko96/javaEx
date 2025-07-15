package mid1.lang.string.method;

public class StringChangeMain2 {
    public static void main(String[] args) {
        String strWithSpace = "    Java Programing  ";
        System.out.println("소문자로 변환: " +strWithSpace.toLowerCase());
        System.out.println("대문자로 변환: " +strWithSpace.toUpperCase());

        System.out.println("공백제거 (trim): '"+ strWithSpace.trim()+"'");
        System.out.println("공백제거 (strip): '"+strWithSpace.strip()+"'"); //특수기호 공백까지 제거 가능
        System.out.println("앞 공백제거 (strip): '"+strWithSpace.stripLeading()+"'");
        System.out.println("뒤 공백제거 (strip): '"+strWithSpace.stripTrailing()+"'");
    }
}
