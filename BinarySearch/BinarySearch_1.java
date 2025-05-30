public class BinarySearch_1{
public static void main(String[] args){
    int[] arr = {2,5,8,10,24,28,30,32,40};
    int item = 30;
System.out.println(Search(arr,item));
}
public static int Search(int[] arr, int item){
    int lo = 0;
    int hi = arr.length -1;
    while(lo <= hi){
        int mid = (lo+hi)/2;
        if(arr[mid] == item){
            return mid;
        }
        else if(arr[mid] > item){
            hi = mid-1;
        }
        else{
            lo = mid+1;
        }
    }
    return -1;

}
}