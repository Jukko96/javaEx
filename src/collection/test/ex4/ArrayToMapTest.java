package collection.test.ex4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "2000"}, {"JPA", "3000"}};
        //주어진 배열로 map 생성
        Map<String, Integer> map = new HashMap<>();

        for (String[] strings : productArr) {
            map.put(strings[0],Integer.valueOf(strings[1]));
        }

        //map의 모든 데이터 출력

        for (String string : map.keySet()) {
            System.out.println("제품 : " +  string + ", 가격 : " + map.get(string));
        }
    }
}
