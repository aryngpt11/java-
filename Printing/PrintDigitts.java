import java.util.Scanner;
public class PrintDigitts {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no:");
        n=sc.nextInt();
        int r;
        while(n>0){
            r=n%10;
            n=n/10;
            System.out.println(r);
        }sc.close();
    }
    
}
