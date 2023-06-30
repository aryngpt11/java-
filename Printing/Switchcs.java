import java.util.Scanner;
public class Switchcs {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no: ");
        n=sc.nextInt();
        switch(n){
            case 1:System.out.println("one");
            break;
            case 2:System.out.println("two");
            break;
            case 3:System.out.println("three");
            break;
            default:System.out.println("Invalid input");
        }
        sc.close();
    }

    
}
