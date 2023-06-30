import java.util.Scanner;
public class Factoriall{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no which we want to find the factorial: ");
        n=sc.nextInt();
       /*  if(n==0||n==1){
            System.out.println("The factorial of 0 and 1 is = 1");
        } */
        for (int i=1;i<(n-1);i++){
            n=n*i;
        }
        System.out.println(n);
        
    }

}