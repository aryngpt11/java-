package Methods;
import java.util.*;
public class GCD {
    static int gcd(int m,int n){
        while(m!=n){
            if(m>n){
                m=m-n;
            }
            else{
                n=n-m;
            }
        }
        return m;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr the value of m: ");
        int m=sc.nextInt();
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        int c=gcd(m, n);
        System.out.println("the Gcd of the given no. is: "+c);

        //System.out.println(gcd(25,15 ));
        sc.close();
    }
    
}
