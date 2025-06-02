
public class Array_8{
    public static void main(String[] args){
        int[][] arr = {
            {1, 2, 3, 4},
            {2, 3, 4, 5},
            {7, 8, 9, 10},
            
        };
        Spiral(arr);
    }

    public static void Spiral(int[][] arr) {
        int minr = 0;
        int maxr = arr.length - 1;      
        int minc = 0;
        int maxc = arr[0].length - 1;  


        int total_element = arr.length*arr[0].length;
int count = 0;   
while(count < total_element){
     // Top Row (left to right)
        for (int i = minc; i <= maxc && count < total_element ; i++) {
            System.out.print(arr[minr][i] + " ");
            count++;
        }
        minr++;

        // Right Column (top to bottom)
        for (int i = minr; i <= maxr && count < total_element; i++) {
            System.out.print(arr[i][maxc] + " ");
            count++;
        }
        maxc--;

        // Bottom Row (right to left)
        for (int i = maxc; i >= minc && count < total_element; i--) {
            System.out.print(arr[maxr][i] + " ");
            count++;
        }
        maxr--;

        // Left Column (bottom to top)
        for (int i = maxr; i >= minr && count < total_element; i--) {
            System.out.print(arr[i][minc] + " ");
            count++;
        }
        minc++;
}
       
    }
}
