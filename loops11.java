//Question 3 :Write a program to find the factorialof any number entered by the user.
//(Hint:factorialofanumbern=n*(n-1)*(n-2)*(n-3)*......*1 and exists for positive numbers only. 
//We write factorial as n!So, factorial of 0! = 1, 1! = 1, 2! = 2, 3! = 6, 4! = 24 and so on
import java.util.*;
public  class loops11{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter a num");
        int n = s.nextInt();
        int fact = 1;
        for(int i =1 ; i<=n ; i++){
             fact *= i;
        }
        System.out.println("factorial of "+n+" is "+fact);
    }
}