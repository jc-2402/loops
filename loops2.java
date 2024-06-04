//print no from 1 to n using while loop
import java.util.*;
public class loops2{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the range");
        int n = s.nextInt();
        int counter = 1;
        while(counter <= n){
            System.out.println(counter);
            counter++;
        }
    }
}