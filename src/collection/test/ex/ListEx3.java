package collection.test.ex;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0;
        System.out.println("n개의 정수를 입력하세요. (종료 0)");

        while(true){
            int input = scanner.nextInt();
            if(input == 0) {
                break;
            }
            numbers.add(input);
        }
        System.out.println("출력");
        for (int i = 0; i < numbers.size(); i++) {
            int target = numbers.get(i);
            System.out.print(target);
            if(i < numbers.size() - 1){
                System.out.print(", ");
            }
            sum += target;
        }
        System.out.println("");
        System.out.println("총합 : "+ sum);
        System.out.println("평균 : " + (double)sum / numbers.size());
    }
}
