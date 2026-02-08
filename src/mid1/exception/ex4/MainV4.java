package mid1.exception.ex4;


import mid1.exception.ex4.Exception.SendExceptionV4;

import java.util.Scanner;

public class MainV4 {
    public static void main(String[] args)  {
        NetworkServiceV4 networkService = new NetworkServiceV4();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("메세지 입력 : ");
            String input = scanner.nextLine();
            if(input.equals("exit")){
                break;
            }
            try {
                networkService.sendMessage(input);
            } catch (Exception e) {
                exceptionHandler(e);//언체크 예외 통채로 처리
            }
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }

    private static void exceptionHandler(Exception e) {
        //공통 처리
        System.out.println("사용자 메시지 : 죄송합니다. 알 수 없는 문제가 발생하였습니다.");
        System.out.println("==개발자용 디버깅 메시지==");
        e.printStackTrace(System.out);//스텍 트레이스 출력
//        e.printStackTrace();

        //필요하면 별도 예외처리 가능
        if(e instanceof SendExceptionV4 sendEx){
            System.out.println("[전송오류] : 전송 데이터 : "+sendEx.getMessage());
        }
    }
}
