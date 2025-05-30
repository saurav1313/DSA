import java.util.Scanner;

public class Pattern_13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int star = 1;
        int space = n - 1;

        while(row <= 2 * n - 1){

            // Print spaces
            int i = 1;
            while(i <= space){
                System.out.print("  "); // Two spaces to align with '* '
                i++;
            }

            // Print stars
            int j = 1;
            while(j <= star){
                System.out.print("* ");
                j++;
            }

            // Update values
            if(row < n){
                star++;
                space--;
            } else {
                star--;
                space++;
            }

            row++;
            System.out.println();
        }
    }
}
