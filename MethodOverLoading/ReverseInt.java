package MethodOverLoading;
import java.util.*;
public class ReverseInt {
    int reverse(int n){
        int rev=0,r;
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        ReverseInt t=new ReverseInt();
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        System.out.println("before reversing the number: "+n);
        System.out.println("After reversing the number: "+t.reverse(n));
        sc.close();
    }
    
}
