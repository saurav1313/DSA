public class Array_3 {
    public static void main(String[] args) {
        int[][] arr = {
            {2, 3, 4, 1},
            {3, 1, 4, 6},
            {3, 5, 7, 8},
            {6, 9, 10, 11}
        };
        
        WavePrint(arr);
    }

    public static void WavePrint(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        for (int col = 0; col < cols; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < rows; row++) {
                    System.out.print(arr[row][col] + " ");
                }
            } else {
                for (int row = rows - 1; row >= 0; row--) {
                    System.out.print(arr[row][col] + " ");
                }
            }
        }
    }
}
