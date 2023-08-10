package DataHiding;
import java.util.*;
class Rectangle{
    private double l;
    private double b;
    public double getL(){
        return l;
    }
    public double getB(){
        return b;
    }
    public void setL(double length){
        l=length;
    }
    public void setB(double breadth){
        b=breadth;
    }
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
        double Length=sc.nextDouble();
        System.out.print("Enter the value of b: ");
        double Breadth=sc.nextDouble();
        r.setL(Length);
        r.setB(Breadth);
        System.out.println("area of rectangle: "+r.area());
        System.out.println("Perimeter of the rectangle: "+r.perimeter());
        System.out.println(r.isSquare());
        sc.close();
    }
    
}