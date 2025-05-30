import java.util.*;

public class Pattern_14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int space = n - 1;
        int star = n;

        while (row <= 2 * n - 1) {
            // print spaces using while loop
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }

            // print stars using while loop
            int j = 1;
            while (j <= star) {
                System.out.print("* ");
                j++;
            }

            // update space and star counts
            if (row < n) {
                star--;
                space--;
            } else {
                star++;
                space++;
            }

            row++;
            System.out.println();
        }

       
    }
}
