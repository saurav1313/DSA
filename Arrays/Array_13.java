//Particular range inverse
import java.util.Scanner;

public class Array_13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int i = sc.nextInt();
        int j = sc.nextInt();
        Reverse(arr, i, j);
            for(int k=0; k<arr.length; k++){
                System.out.print(arr[k]+" ");
            }
        
    }
    public static void Reverse(int[] arr,int i,int j){
        while(i < j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}