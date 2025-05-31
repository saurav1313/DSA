public class BinarySearch_4{
    public static void main(String[] args){
int[] arr = {2,5,1,2,-3,8,9};
System.out.print(maxSubArray(arr));
    }
    public static int maxSubArray(int[] arr){
int ans = Integer.MIN_VALUE;
for(int i=0; i<arr.length; i++){
    int sum = 0;
    for(int j = i; j<arr.length; j++){
        sum = sum + arr[j];
        ans = Math.max(sum,ans);
    }
}
return ans;
    }
}