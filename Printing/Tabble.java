import java.util.Scanner;
public class Tabble {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the number: ");
        n=sc.nextInt();
       
        for (int i=1;i<11;i++){
            int a=n*i;
            System.out.println(n+" "+ "X"+" " +i+"="+a);
        }
        sc.close();
    }
    
}
