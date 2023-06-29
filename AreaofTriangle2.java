import java.util.Scanner;
public class AreaofTriangle2 {

    public static void main(String[] args) {
        int a,b,c;
        double Area;
    
        float S;
        
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter a:");
        a=sc.nextInt();
        System.out.println("Enter b:");

        b=sc.nextInt();
        System.out.println("enter c:");
        c=sc.nextInt();
        S=((a+b+c)/2f);
        Area= Math.sqrt(S*(S-a)*(S-b)*(S-c));
        System.out.println(Area);
        sc.close();

     
    }
    
}