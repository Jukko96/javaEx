public class EnhancedFor {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6};
        //일반 for
        for (int i = 0; i < numbers.length ; i++) {
            System.out.println(numbers[i]);
        }
        //향상된 for문 for-each문 단축키 iter
        for(int number : numbers){
            System.out.println(number);
        }


    }
}
