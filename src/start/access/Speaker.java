package start.access;

public class Speaker {
    private int volume;
    Speaker(int volume){
        this.volume = volume;
    }
    void volumeUp(){
        if(this.volume>=100){
            System.out.println("볼륨은 100을 넘을 수 없습니다.");
        }else{
            this.volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }
    void volumeDown(){
        this.volume -= 10;
        System.out.println("volumeDown 호출");
    }
    void showVolume(){
        System.out.println("현재 음량: "+this.volume);
    }
}
