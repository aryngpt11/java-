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
        int p=sc.nextInt();
        
       // System.out.println(isPrime(n));
        boolean c=isPrime(p);
        if (c==true){
            System.out.println(p+" is a prime number");
        }
        else{
            System.out.println(p+" is not a prime number");
        }
        sc.close();
        
    }
    
    
}
