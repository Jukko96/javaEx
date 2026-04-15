package collection.test.ex4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ItemPriceTest {
    public static void main(String[] args) {
        Map<String,Integer> itemMap = new HashMap<>();
        itemMap.put("사과",500);
        itemMap.put("바나나",500);
        itemMap.put("망고",1000);
        itemMap.put("딸기",1000);
        Set<String> result = new HashSet<>();

//        for (String key : itemMap.keySet()) {
//            if(itemMap.get(key) >=1000){
//                result.add(key);
//            }
//        }
        for (Map.Entry<String, Integer> entry : itemMap.entrySet()) {
//            if(entry.getValue() >= 1000){
            if(entry.getValue().equals(1000)){
                result.add(entry.getKey());
            }

        }
        System.out.println(result);
    }
}
