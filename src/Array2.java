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
    }
}
