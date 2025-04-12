public class Method {
    public static void main(String[] args) {
        add(1,2);
    }
    public static int add(int a, int b){
        int sum = a + b;
        System.out.println(a + "+" + b);
        System.out.println("sum = " + sum);
        return sum;
    }
}
