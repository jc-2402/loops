//continue statement
//display all no.s entered by user expect multiple of 10
import java.util.*;
public class loops8{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        do{
            System.out.print("enter the num :");
            int n = s.nextInt();
            if( n%10 == 0){
                continue;
            }
            System.out.println("num was : "+n);
        }while(true);
    }
} 