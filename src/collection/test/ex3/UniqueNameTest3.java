package collection.test.ex3;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueNameTest3 {
    public static void main(String[] args) {
        //중복 제거와 데이터 순서 유지
        Integer[] inputArr = {5,30,20,20,10,10};
        Set<Integer> set = new TreeSet<>(List.of(inputArr));

        for (Integer data : inputArr) {
            set.add(data);
        }

        for (Integer data : set) {
            System.out.println(data);
        }
    }
}
