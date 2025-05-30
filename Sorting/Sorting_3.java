public class Sorting_3{
    public static void main(String[] args){
        int[] arr = {2, 13, -4, 5, 7};
        Sort(arr);
    for(int i= 0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
    }
        
    }
    public static void Sort(int[] arr){

     int mini = 0;
     for(int j = 1; j<arr.length; j++){
        if(arr[j] < arr[mini]){
mini = j;
        }
     } 
     int temp = arr[0];
     arr[0] = arr[mini];
     arr[mini] = temp;
    }
}