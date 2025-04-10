public class Array2 {
    public static void main(String[] args) {
        String[][] d2Array;
        d2Array = new String[2][3];
        for (int row = 0; row < d2Array.length; row++) {
            for (int column = 0; column < d2Array[row].length; column++) {
                d2Array[row][column] = ""+row+column;
                System.out.println("position" + d2Array[row][column]);
            }
        }
        int [][] initArray = {{1,2,3},{4,5,6}};// 2차원 배열 초기화;
        int [][] initArray2 = new int[][]{{1,2,3},{4,5,6}};
        int [][] fillArray = new int[2][3];
        int i = 1;
        for (int row = 0; row < d2Array.length; row++) {
            for (int column = 0; column < d2Array[row].length; column++) {
                fillArray[row][column] = i++;
            }
        }
        for (int row = 0; row < d2Array.length; row++) {
            for (int column = 0; column < d2Array[row].length; column++) {
                System.out.print(fillArray[row][column]+" ");
            }
            System.out.println();
        }
    }
}
