package QuestionsImp;
import java.util.*;
public class Palindromee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no o check palindrome or not: ");
        int n=sc.nextInt();
        int m=n;
        int rev=0,r;
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;

        }
        if (rev==m){
            System.out.println("The given no is palindrome: "+m);
        }
        else{
            System.out.println("The given no is not palindrome: "+m);
        }
        sc.close();

        }
        
    }
    

