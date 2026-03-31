package collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        MyArrayList<Integer> arr = new MyArrayList<>();

        BatchProcessor processor1 = new BatchProcessor(arr);
        System.out.println("MyArrayList");
        processor1.logic(100_000);

        System.out.println("MyLinkedList");
        MyLinkedList<Integer> list = new MyLinkedList<>();
        BatchProcessor processor2 = new BatchProcessor(list);
        processor2.logic(100_000);


    }
}
