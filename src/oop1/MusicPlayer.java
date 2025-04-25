package oop1;

public class MusicPlayer {
    int volume;
    boolean isOn;

    void on (){
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }
    void off (){
        isOn = false;
        System.out.println("음악 플레이어 종료");
    }

    void volumeUp (){
        volume ++;
        System.out.println("음악 플레이어 볼륨 : "+volume);
    }
    void volumeDown (){
        volume --;
        System.out.println("음악 플레이어 볼륨 : "+volume);
    }
    void showState (){
        System.out.println("음악 플레이어 상태 롹인");
        if(isOn){
            System.out.println("음악 플레이어 on, 볼룸 : "+volume);
        }else{
            System.out.println("음악 플레이어 off");
        }
    }
}
