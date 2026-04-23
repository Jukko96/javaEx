package collection.iterable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class JavaIterableMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> listIterator = list.iterator();
//        while (listIterator.hasNext()){
//            System.out.println("listIterator.next() = " + listIterator.next());
//        }
        printAll(listIterator);
        forEach(list);

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        Iterator<Integer> setIterator = list.iterator();
//        while (setIterator.hasNext()){
//            System.out.println("setIterator.next() = " + setIterator.next());
//        }

        
        printAll(setIterator);
        forEach(set);
    }

//    private static void forEach(HashSet<Integer> set) {
//        for (Integer i : set) {
//            System.out.println(i);
//        }
//    }
//
//    private static void forEach(List<Integer> list) {
//        for (Integer i : list) {
//            System.out.println(i);
//        }
//    }
    private static void forEach(Iterable<Integer> iterable) {
        System.out.println("iterable = " + iterable.getClass());
        for (Integer i : iterable) {
            System.out.println(i);
        }
    }

    private static void printAll(Iterator<Integer> iterator){

        System.out.println("iterator :" + iterator.getClass());
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


}
