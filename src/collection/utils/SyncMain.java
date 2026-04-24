package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

//        //쓰레드 1
//        list.add(1);
//        list.add(2);
//        list.add(3);
//
//        //쓰레드 2
//        list.remove(1);

        System.out.println("list class = " + list.getClass());
        List<Integer> synchronizedList = Collections.synchronizedList(list); //동시성 문제 해결
        System.out.println("synchronizedList class = " + synchronizedList.getClass());
    }
}
