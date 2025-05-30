public class Array_14{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        RotateArray(arr, k);
       for(int i=0; i < arr.length; i++){
         System.out.print(arr[i]+" ");
       }
    }
    public static void RotateArray(int[] arr, int k){
        int n =arr.length;
        k = k % n;

        int last_Element = arr[n-1];
        for(int i = n-2; i>=0; i--){
            arr[i+1] = arr[i];
        }
arr[0] = last_Element;
    }
}