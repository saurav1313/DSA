public class Array_4{
    public static void main(String[] args){
             int[][] arr = {
            {2, 3, 4, 1},
            {3, 1, 4, 6},
            {3, 5, 7, 8},
            {6, 9, 10, 11}
        };
    TransposeArray(arr);
    for(int i = 0; i<arr.length; i++){
        for(int j=0; j<arr[0].length; j++){
            System.out.print(arr[i][j]+" ");

        }
        System.out.println();
    }
    }
    public static void TransposeArray(int[][] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                int temp = arr[i][j];
               arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
}