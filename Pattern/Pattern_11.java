import java.util.Scanner;
public class Pattern_11{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int space = 2*n-3;
while(row<=n){
        //star
int i = 1;
while(i<=star){
    System.out.print("* ");
    i++;
}

        //space
int j = 1;
while(j<=space){
    System.out.print("  ");
    j++;
}

int k = 1;
if(row == n){
    k=2;
}
while(k<=star){
    System.out.print("* ");
    k++;
}

        //row updation

        row++;
        System.out.println();
        star++;
        space-=2;
    }
}
}
