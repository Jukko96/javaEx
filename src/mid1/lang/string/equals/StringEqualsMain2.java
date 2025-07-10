package mid1.lang.string.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println("srt1 == str2 : " + (str1==str2));
        System.out.println("str1.equals(str2) : "+ (str1.equals(str2)));
        System.out.println("isSame(str1,str2) : "+isSame(str1,str2));

        String str3 = "hello";
        String str4 = "hello";

        System.out.println("str1,str3 리터럴 비교 : " + (str1==str4));
        System.out.println("isSame(str1,str3) : "+isSame(str1,str3));

        System.out.println("str3,str4 리터럴 비교 : " + (str3==str4));
        System.out.println("str3.equals(str4) : "+ (str3.equals(str4)));
        System.out.println("isSame(str3,str4) : "+isSame(str3,str4));
    }
    private static boolean isSame(String x, String y){
//        return x == y;
        return x.equals(y);//new에서 올지 Pool에서 올지 모르기 때문에 항상 equals로 비교해야함!
    }

}
