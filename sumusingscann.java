
import java.util.Scanner;
public class sumusingscann{
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        /* int a,b,c;
        System.out.println("Enetr two no. for adding:" );
        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;
        System.out.println(c);
        sc.close(); */
        String name;
        System.out.println("What is your name: ");
        //name=sc.next();
        name=sc.nextLine();
        System.out.println(name);
        sc.close();

    }

}