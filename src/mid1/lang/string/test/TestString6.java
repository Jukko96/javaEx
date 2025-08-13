package mid1.lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        //str에서 key로 주어지는 문자를 찾고 찾은 문자의 수를 출력하라
        String str = "start hello java, hello spring, hello jpa.";

        String key = "hello";
        int sum = 0;
        int index = 0;
        while(true){
            int found = str.indexOf(key,index);
            if(found == -1){
                break;
            }else{
                sum++;
                index = found + key.length();
            }

        }
        System.out.println(sum);
    }
}
