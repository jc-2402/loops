//print sum of 1st n natural no.s
import java.util.*;
public class loops3{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter range of the natural numbers");
        int n = s.nextInt();
        int sum = 0 , counter =0;
        while(counter <= n){
            sum += counter;
            counter++;
        }
        System.out.print("sum is "+sum);
    }
}