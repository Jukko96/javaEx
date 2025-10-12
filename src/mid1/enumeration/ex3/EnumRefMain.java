package mid1.enumeration.ex3;

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println("class BASIC = " + Grade.BASIC.getClass());
        System.out.println("class GOLD = " + Grade.GOLD.getClass());
        System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());


        System.out.println("ref BASIC = " + Grade.BASIC);
        System.out.println("refValue BASIC = " + refValue(Grade.BASIC));

    }

    private static String refValue(Grade grade){
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
