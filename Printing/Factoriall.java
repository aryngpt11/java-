import java.util.Scanner;
public class Factoriall{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no:");
        n=sc.nextInt();
        int fact=1;
        for (int i=1;i<=n;i++){
            fact=fact*i;
        }System.out.println("the factorial of:"+" "+n+ "" +"is "+fact);
        sc.close();
    }

}