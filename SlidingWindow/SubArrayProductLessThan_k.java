public class SubArrayProductLessThan_k{
    public static void main(String[] args){
int[] arr = {10,5,2,6};
int k = 100;
System.out.println(Countof_SubArray(arr, k));
    }
    public static int Countof_SubArray(int []arr, int k){
int si = 0;
int ei = 0;
int p = 1;
int ans = 0;

while(ei < arr.length){
    //Growing
    p *= arr[ei];

    //Shrinking
    while(p>=k && si <= ei){
        p /= arr[si];
        si++;
    }
    //ans calculated
    ans += (ei - si +1);
    ei++;
}
return ans;
    }
}