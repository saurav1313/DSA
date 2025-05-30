//Insertion Sort

public class Sorting_5{
    public static void main(String[] args){
        int[] arr = {2,13,-7,8,15,11};
        Sort(arr);
        for(int i=0; i<arr.length; i++){
System.out.print(arr[i]+" ");
        }
    }

    
    public static void Sort(int[] arr){
        //Single element Sorted hoga
        for(int i=1; i<arr.length; i++){
 int picked = arr[i]; //hand picked playing card
 int j = i - 1;
 while(j >= 0 && arr[j] > picked){
    arr[j + 1] = arr[j];
j--;    
 }
 arr[j + 1] = picked;
        }
    }
}

