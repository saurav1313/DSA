//Serach Maximum elements in an array -->1st Approch

public class Array_9{
    public static void main(String[] args){
        int[] arr = {10,3,15,90,50,60};
       System.out.println(MaxElement(arr));
    }
    public static int MaxElement(int[] arr){
         int max = arr[0];
        for(int i =1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}