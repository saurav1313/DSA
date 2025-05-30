//Serach Maximum elements in an array -->3rd Approch-->use int min value here

public class Array_11{
    public static void main(String[] args){
        int[] arr = {10,3,15,90,50,60};
       System.out.println(MaxElement(arr));
    }
    public static int MaxElement(int[] arr){
         int max = Integer.MIN_VALUE;
        for(int i =1; i<arr.length; i++){
           max = Math.max(arr[i], max);
        }
        return max;
    }
}