package Methods;
import java.util.*;
public class PrimeNumber {
    static boolean isPrime(int n){
        for (int i=2;i<n/2;i++){
            if(n%i==0){
                return false;
            }
        }return true;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value you want to check that the number is prime or not: ");
        int n=sc.nextInt();
        
       // System.out.println(isPrime(n));
        boolean c=isPrime(n);
        if (c==true){
            System.out.println(n+" is a prime number");
        }
        else{
            System.out.println(n+" is not a prime number");
        }
        
    }
    
}
