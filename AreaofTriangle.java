import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String[] args) {
        float b,h,Area;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter height:");
        h=sc.nextFloat();
        System.out.println("Enter base:");

        b=sc.nextFloat();
        Area=0.5f*b*h;
        System.out.println(Area);
        sc.close();

     
    }
    
}
