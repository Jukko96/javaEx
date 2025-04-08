public class Array {
    public static void main(String[] args) {
        int[] student; //베얄 선언
        int[] student2 = new int[]{10,20,30,40}; //배열 생성과 동시에 초기화
        student = new int[3];
        for (int i = 0; i < 3; i++) {
            student[i] = 10 * (i+1);
            System.out.println(student[i]);
        }
        for (int i = 0; i < student2.length; i++) {

            System.out.println(student2[i]);
        }
    }
}
