package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        //학생 성적 데이터 추가
        studentMap.put("studentA",80);
        System.out.println(studentMap);

        studentMap.put("studentA",50); //같은 키에 저장 시 기존 값 교체
        System.out.println(studentMap);
    }
}
