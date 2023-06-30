import java.util.Scanner;
public class SumofN {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no:");
        n=sc.nextInt();
        int summ=0;
        for (int i=1;i<=n;i++){
            summ=summ+i;
        }System.out.println(summ);
        sc.close();
    }
    
}
