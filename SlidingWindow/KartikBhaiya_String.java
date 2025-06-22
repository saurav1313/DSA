import java.util.Scanner;


public class KartikBhaiya_String{
    
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int k = sc.nextInt();
String s = sc.next();
int flip_a = MaxLengthOfString(s, 'a', k);
int flip_b = MaxLengthOfString(s, 'b', k);
System.out.println(Math.max(flip_a, flip_b));

    }
    public static int MaxLengthOfString(String str, char ch, int k){
int si = 0;
int ei = 0;
int ans = 0;
int flip = 0;

while(ei<str.length()){
    //growing
if(str.charAt(ei) == ch){
    flip++;

}

    //shrink
while(flip>k && si<=ei){
    if(str.charAt(si) == ch){
    flip--;
}
si++;
}
    //ans calculate

    ans = Math.max(ans, ei -si + 1);
    ei++;
}
return ans;
    }
}
