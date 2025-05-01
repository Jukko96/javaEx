package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();
        speaker.volumeUp();
        speaker.showVolume();
        speaker.volumeUp();
        speaker.showVolume();

//        System.out.println("volume 필드에 직접 접근 수행");
//        speaker.volume += 10;

        speaker.showVolume();
    }
}
