package QuestionsImp;
import java.util.*;

public class Reversse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to reverse: ");
        int n=sc.nextInt();
        int rev=0,r;
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;

        }
        System.out.println(rev);
        sc.close();
    }
    
}
