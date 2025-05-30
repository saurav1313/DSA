public class Array_7{
    public static void main(String[] args){
        int []arr = {10,20,30,40,50};
        int []others = {100,200,300,400,500};
        System.out.println(arr[0]+" "+others[0]);
        Swap(arr, others);
        System.out.println(arr[0]+" "+others[0]);
    }
    public static void Swap(int[] arr, int[] others){
        int[] temp = arr;
        arr = others;
        others = temp;
    }
}