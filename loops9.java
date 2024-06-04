
import java.util.Scanner;

//check if a no. is prime or not
public class loops9{
    public static void  main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the num to check prime");
        int n = s.nextInt();

        if(n==2){
            System.out.println("n is prime ");
        }
        else{
            boolean isprime = true;
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i == 0){
                    isprime = false;
                }
            }

            if(isprime == true){
                System.out.println("n is prime");
            }
            else{
                System.out.println("n is not prime");
            }
        }

    }
}