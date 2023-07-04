package QuestionsImp;
import java.util.*;
public class GeometricProgression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a(intial element): ");
        int a=sc.nextInt();
        System.out.println("enter the value of r(common ratio): ");
        int r=sc.nextInt();
        System.out.println("enter the element counting: ");
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            System.out.print(a+",");
            a=a*r;

        }sc.close();
        

    }
}
