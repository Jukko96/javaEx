package access.test;

public class MaxCounterMain {
    public static void main(String[] args) {
        MaxCounter maxCounter = new MaxCounter(3);
        System.out.println("current count = " +maxCounter.getCount());
        maxCounter.increment();
        System.out.println("current count = " +maxCounter.getCount());
        maxCounter.increment();
        System.out.println("current count = " +maxCounter.getCount());
        maxCounter.increment();
        System.out.println("current count = " +maxCounter.getCount());
        maxCounter.increment();
        System.out.println("current count = " +maxCounter.getCount());


    }
}
