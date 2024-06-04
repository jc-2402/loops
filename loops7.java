//break statement
//keep entering no. till user enters a multiple of 10
import java.util.*;
public class loops7{
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        do{
            System.out.print("enter the num : ");
            int n = s.nextInt();
            if( n%10 ==0){
                break;
            }
            System.out.println("num is :"+n);
        }while(true);
    }
}