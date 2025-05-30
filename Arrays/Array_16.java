//Reversal Rotateed Array

public class Array_16{
    public static void main(String[] args){
int[] arr = {1,2,3,4,5,6,7};
int k = 3;
RoatedArray(arr, k);
for(int i = 0; i<arr.length; i++){
    System.out.print(arr[i]+" ");
}

    }
    public static void RoatedArray(int[] arr, int k){
int n = arr.length;
k = k % n;

ReversalArray(arr, 0, n - k -1);// 1st--> 0 se n-1 element
ReversalArray(arr, n - k, n - 1);// last ke k element k liye
ReversalArray(arr, 0, n - 1);// whole Array k liye

    }
    public static void ReversalArray(int[] arr, int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}