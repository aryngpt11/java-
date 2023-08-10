package Inheritance;


class Circle{
    public double radius;
    public double area(){
        return 3.14*radius*radius;
    }
    public double perimeter(){
        return 2*3.14*radius;
    }
}
class Cylinder extends Circle{
    public double height;
    public double volume(){
        return area()*height;
    }
}
public class CircleInherit {
    public static void main(String[] args) {
         Cylinder c=new Cylinder();
         c.radius=7;
         c.height=10;
         System.out.println(c.volume());
         System.out.println(c.area());
         System.out.println(c.perimeter());
        
    }
    
}
