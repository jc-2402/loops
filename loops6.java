//reverse a given no.
import java.util.*;
public class loops6{
    public static void main (String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the num");
        int n = s.nextInt();
        int rev =0;
        while(n>0){
            int lastdigit = n%10;
            rev = (rev*10)+lastdigit;
            n= n/10;
        }
        System.out.println(rev);
    }
}