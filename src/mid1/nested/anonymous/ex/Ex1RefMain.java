package mid1.nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMain {

    public static void Hello(Process process){
        System.out.println("프로그램 시작");
        process.run();
        System.out.println("프로그램 종료");
    }


    public static void main(String[] args) {
        Process Dice = new Process(){

            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            }
        };
        Process Sum = new Process(){

            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        };
        Hello(Dice);
        Hello(Sum);
    }
}
