public class BinarySearch_3{
    public sttaic void main(String[] args){

    }
    public static int firstBadVersion(int n){
        int lo =1;
        int hi = n;
        int ans = 00;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
if(isBadVersion(mid)==true){
    ans = mid;
    hi = mid - 1;
}
else{
    lo = mid + 1;
}
        }
        return ans;
    }
    public static boolean isBadVersion(int mid){
        return mid;
    }
}