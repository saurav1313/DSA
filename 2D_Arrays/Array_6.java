//This pgm print only boundary 

public class Array_6 {
    public static void main(String[] args){
        int[][] arr = {
            {1, 2, 3, 4},
            {2, 3, 4, 5},
            {7, 8, 9, 10},
            {11, 12, 34, 89}
        };
        Spiral(arr);
    }

    public static void Spiral(int[][] arr) {
        int minr = 0;
        int maxr = arr.length - 1;      
        int minc = 0;
        int maxc = arr[0].length - 1;   




        // Top Row (left to right)
        for (int i = minc; i <= maxc; i++) {
            System.out.print(arr[minr][i] + " ");
         
        }
        minr++;

        // Right Column (top to bottom)
        for (int i = minr; i <= maxr; i++) {
            System.out.print(arr[i][maxc] + " ");
          
        }
        maxc--;

        // Bottom Row (right to left)
        for (int i = maxc; i >= minc; i--) {
            System.out.print(arr[maxr][i] + " ");
        
        }
        maxr--;

        // Left Column (bottom to top)
        for (int i = maxr; i >= minr; i--) {
            System.out.print(arr[i][minc] + " ");
            
        }
        minc++;
    }
}
