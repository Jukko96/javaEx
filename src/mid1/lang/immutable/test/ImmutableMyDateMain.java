package mid1.lang.immutable.test;

public class ImmutableMyDateMain {
    public static void main(String[] args) {
        MyDate mydate = new MyDate(1996, 6, 28);
        ImmutableMyDate immutableMyDate = new ImmutableMyDate(1996, 6, 27);

        System.out.println("mydate = " + mydate.toString());
        System.out.println("immutableMyDate = "+ immutableMyDate.toString());

        System.out.println("change value");


        mydate.setYear(2000);
        mydate.setMonth(2);
        mydate.setDay(22);

        immutableMyDate = immutableMyDate.withYear(2000);
        immutableMyDate = immutableMyDate.withMonth(2);
        immutableMyDate = immutableMyDate.withDay(22);

        System.out.println("mydate = " + mydate.toString());
        System.out.println("immutableMyDate = "+ immutableMyDate.toString());
    }
}
