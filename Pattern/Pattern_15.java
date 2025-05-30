import java.util.*;

public class Pattern_15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int space = n - 1;
        int star = n;

        while(row <= 2 * n - 1){

            //star
            int i =1;
            while(star<=n){
                System.out.print("* ");
                i++;
            }
            //space
            int j =1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            //update 
            //mirror concept
              if (row < n) {
                star--;
                space++;
            } else {
                star++;
                space--;
            }

            row++;
            System.out.println();
        }
        }
    }

