package final1;

import memory.Data;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data(10);
        //data= new Data(20) //참조값 변경 불가
        System.out.println(data.getValue());
        data.setValue(20); // 필드값은 변경 가능
        System.out.println(data.getValue());

    }
}
