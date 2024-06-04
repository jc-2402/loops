//print the reverse of a given no. 
import java.util.*;
public class loops5{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number to be reversed ");
        int n = s.nextInt();
        // for(int i =n; i>0; i/10)
        while(n>0){
            int lastdigit = n%10;
            System.out.print(lastdigit+" ");
            n = n/10;
        }
    }
}