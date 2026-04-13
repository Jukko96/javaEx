package collection.test.ex3;

import java.util.HashSet;
import java.util.Set;

public class UniqueNameTest1 {
    public static void main(String[] args) {
        //배열 중복제거
        Integer[] inputArr = {30,20,20,10,10};
        Set<Integer> set = new HashSet<>();

        for (Integer data : inputArr) {
            set.add(data);
        }

        for (Integer data : set) {
            System.out.println(data);
        }
    }
}
