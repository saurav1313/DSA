public class Array_17{
    public static void main(String[] args){
        int[] arr = {0,1,2,0,3,5,8,4,0,1,2};
        System.out.println(Rain_Water_Trapping(arr));

    }
    public static int Rain_Water_Trapping(int[] arr){
        int n = arr.length;//arry k size hai

       int[] left = new int[n];
       left[0] = arr[0];
       for(int i=1; i<n; i++){
        left[i] = Math.max(left[i-1],arr[i]);
       }
       int[] right = new int[n];
       right[n-1] = arr[n-1];
       for(int i=n-2; i>=0; i--){
        right[i] = Math.max(right[i+1],arr[i]);
       }
       int sum = 0;
       for(int i=0; i<n; i++){
        sum = sum + Math.min(left[i], right[i]) - arr[i];
       }
       return sum;
    }
}