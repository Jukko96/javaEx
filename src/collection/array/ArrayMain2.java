package collection.array;

import java.util.Arrays;

public class ArrayMain2 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        arr[0] = 1;
        arr[1] = 2;
        System.out.println(Arrays.toString(arr));

        System.out.println("배열의 첫 번째 위치에 값 추가 O(n)");
        //기존 데이터를 한 칸씩 밀고 배열의 첫 위치에 추가
        int newValue =3;
        addFirst(arr, newValue);
        System.out.println(Arrays.toString(arr));

        //index 위치에 추가
        //기존 데이터를 한 칸씩 밀고 배열의 index 위치에 추가
        System.out.println("배열의 index(2) 위치에 값 추가 O(n)");
        int index = 2;
        int value = 4;
        addAtIndex(arr,index,value);
        System.out.println(Arrays.toString(arr));

        System.out.println("배열의 마지막 위치에 값 추가 O(1)");
        int lastValue = 10;
        addLast(arr,lastValue);
        System.out.println(Arrays.toString(arr));

    }

    private static void addLast(int[] arr, int lastValue) {
        arr[arr.length-1] = lastValue;
    }

    private static void addAtIndex(int[] arr, int index, int value) {
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = value;
    }

    private static void addFirst(int[] arr, int newValue) {
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = newValue;
    }
}
