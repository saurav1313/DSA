public class KadanAlgo_5{
public static void main(String[] args){
    int[] arr = {2,5,1,2,-3,8,9};
System.out.print(MaxSum(arr));
}
public static int MaxSum(int[] arr){
    int sum = 0;
    int ans = Integer.MIN_VALUE;
    for(int i =0; i<arr.length; i++){
sum = sum + arr[i];
ans = Math.max(ans, sum);
if(sum<0){
    sum = 0;
}
    }
    return ans;
}
}