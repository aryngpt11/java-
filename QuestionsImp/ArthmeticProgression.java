package QuestionsImp;
import java.util.*;

public class ArthmeticProgression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a(intial element): ");
        int a=sc.nextInt();
        System.out.println("Enter the value of d (common differnce): ");
        int d=sc.nextInt();
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            System.out.print(a+",");
            a=a+d;

        }
        sc.close();
    }
}
