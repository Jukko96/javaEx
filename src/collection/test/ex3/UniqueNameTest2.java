package collection.test.ex3;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNameTest2 {
    public static void main(String[] args) {
        //순서를 유지한 채 배열 중복 제거
        Integer[] inputArr = {5,30,20,20,10,10};
        Set<Integer> set = new LinkedHashSet<>(List.of(inputArr));

        for (Integer data : inputArr) {
            set.add(data);
        }

        for (Integer data : set) {
            System.out.println(data);
        }
    }
}
