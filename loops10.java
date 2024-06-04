//Question2: Write a program that reads a set of integers,and then prints the sum of the 
//even and odd integers
import  java.util.*;
public class loops10{
    public static void main(String[] args) {
         Scanner s= new Scanner(System.in);
         System.out.println("enter num");
         int n = s.nextInt();
         int evensum = 0;
         int oddsum = 0;
         while(n>0){
            int lastdigit = n%10;
            if(lastdigit %2 ==0){
                evensum += lastdigit ;
            }
            else{
                oddsum += lastdigit;
            }
            n = n/10;
         }
         System.out.println("even sum is "+evensum);
         System.err.println("odd sum is "+oddsum);
    }
}