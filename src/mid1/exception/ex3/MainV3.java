package mid1.exception.ex3;


import mid1.exception.ex3.Exception.NetworkClientExceptionV3;

import java.util.Scanner;

public class MainV3 {
    public static void main(String[] args)  {
        NetworkServiceV3_1 networkService = new NetworkServiceV3_1();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("메세지 입력 : ");
            String input = scanner.nextLine();
            if(input.equals("exit")){
                break;
            }
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
