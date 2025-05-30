import java.util.Scanner;
public class Pattern_3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = n;
        int row = 1;

        while(row<=n){
        int i = 1;
            //Star
            while(i <= star){
                System.out.print("* ");
                i++;
            }

             //next row prepration

            star--;
            row++;
            System.out.println();
        }
    }
}