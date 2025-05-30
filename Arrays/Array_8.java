//Search items in elements


public class Array_8{
    public static void main(String[] args){
int[] arr = {2,3,4,5,-9,10,1};
int item = 4;
System.out.println(Search(arr, item));
    }
    public static int Search(int[] arr, int item){
for(int i =0; i<arr.length; i++){
    if(arr[i] == item){
        return i;
    }   
}
return -1;
    }
}