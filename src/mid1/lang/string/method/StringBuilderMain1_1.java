package mid1.lang.string.method;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");

        System.out.println("sb = "+ sb);
        sb.insert(4,"Java");
        System.out.println("insert = "+ sb);

        sb.delete(4,8);
        System.out.println("delete  = "+ sb);

        sb.reverse();
        System.out.println("reverse = "+ sb);

        //StringBuilder -> String
        String str = sb.toString();
        System.out.println("String = " + str);
    }
}
