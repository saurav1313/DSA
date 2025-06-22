public class SubArraySumOf_K{

    public static void main(String[] args){
        
        int[] arr = {2,1,3,4,5,6,7,8,9,2,3};
        int k =3;
System.out.println(MaxSum_of_Size_k(arr,k));
    }
    public static int MaxSum_of_Size_k(int []arr, int k){
        int ans = 0;
        int sum = 0;
        //1st window ka kaaam
        for(int i =0; i<k; i++){
            sum += arr[i];
        }
        ans = sum;
        for(int i = k; i<arr.length; i++){
            sum += arr[i]; // winodw grow kr gya
            sum -= arr[i-k]; //window srink krna
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}