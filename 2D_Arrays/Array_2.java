import java.util.Scanner;

public class Array_2{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr=new int[r][c];
        for(int i =0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
arr[i][j] = sc.nextInt();
            }
        }
        Display(arr);
    }
      public static void Display(int[][] saurav) {
        for (int i = 0; i < saurav.length; i++) {
            for (int j = 0; j < saurav[0].length; j++) {
                System.out.print(saurav[i][j] + " ");
            }
            System.out.println();
        }
    }
}