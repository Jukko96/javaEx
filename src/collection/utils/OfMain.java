package collection.utils;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMain {
    public static void main(String[] args) {
        //편리한 불변 컬렉션
        List<Integer> list = List.of(1, 2, 3);
//        list.add(1); //불변
        Set<Integer> set = Set.of(1, 2, 3);
        Map<String, Integer> map = Map.of("a", 10, "b", 20);

        System.out.println("list = " + list);
        System.out.println("set = " + set);
        System.out.println("map = " + map);

        System.out.println("list class = " +  list.getClass());

    }
}
