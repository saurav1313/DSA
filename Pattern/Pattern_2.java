import java.util.Scanner;

public class Pattern_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int star = 1;
        int row = 1;
        while(row<=n){

//Star
            int i = 1;
            while(i <= star){
                System.out.print("* ");
                i++;
            }

            //Next rwo prepration
            star++;
            row++;
            System.out.println();
        }
    }
}