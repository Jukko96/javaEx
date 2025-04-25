package oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
         MusicPlayerData data = new MusicPlayerData();
         on(data);
         volumeUp(data);
         volumeDown(data);
         volumeUp(data);
         showState(data);
         off(data);
    }
    static void on (MusicPlayerData data){
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }
    static void off (MusicPlayerData data){
        data.isOn = false;
        System.out.println("음악 플레이어 종료");
    }

    static void volumeUp (MusicPlayerData data){
        data.volume ++;
        System.out.println("음악 플레이어 볼륨 : "+data.volume);
    }
    static void volumeDown (MusicPlayerData data){
        data.volume --;
        System.out.println("음악 플레이어 볼륨 : "+data.volume);
    }
    static void showState (MusicPlayerData data){
        System.out.println("음악 플레이어 상태 롹인");
        if(data.isOn){
            System.out.println("음악 플레이어 on, 볼룸 : "+data.volume);
        }else{
            System.out.println("음악 플레이어 off");
        }
    }
}
