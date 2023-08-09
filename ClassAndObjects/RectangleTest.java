package ClassAndObjects;
import java.util.*;
class Rectangle{
    public double l;
    public double b;
    public double area(){
        return l*b;
    }
    public double perimeter(){
        return 2*(l+b);
    }
    public boolean isSquare(){
        return l==b;
    }
        

}
public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the value of l: ");
        double length=sc.nextDouble();
        System.out.print("Enter the value of b: ");
        double breadth=sc.nextDouble();
        r.l=length;
        r.b=breadth;
        System.out.println("area of rectangle: "+r.area());
        System.out.println("Perimeter of the rectangle: "+r.perimeter());
        System.out.println(r.isSquare());
        sc.close();
    }
    
}
