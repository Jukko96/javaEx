package collection.test.ex4;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String question = "orange apple banana banana apple";

        String[] arr = question.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String string : arr) {
//            if(map.containsKey(string)){
//                map.put(string, map.get(string) + 1);
//            }else{
//                map.put(string,1);
//            }
            Integer count = map.getOrDefault(string,0);
            count ++;
            map.put(string,count);
        }
        System.out.println(map);

    }
}
