package mid1.lang.string.test;

public class TestString5 {
    public static void main(String[] args) {
        //str에는 파일이름과 확장자가 주어진다. ext에는 파일의 확장자가 주어진.
        //파일명과 확장자를 분리하여 출력하라
        String str = "hello.txt";
        String ext = ".txt";
        System.out.println(str.indexOf(ext));
        System.out.println("file name : "+ str.substring(0,str.indexOf(ext)));
        System.out.println("extension name : "+str.substring(str.indexOf(ext)));
    }
}
