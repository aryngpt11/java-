package Classes_And_Objects;



import java.util.Scanner;


class Circle {
   public double r;
   public double area(){
    return Math.PI*r*r;
   }
   public double perimeter(){
    return 2*Math.PI*r;
   }
   public double circumference(){
    return perimeter();
   }
    
}
public class Circle1{
   public static void main(String[] args) {
      Circle c=new Circle();
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of r: ");
      double radius = sc.nextDouble();
      c.r=radius;
      
      

      System.out.println(c.area());
      System.out.println(c.perimeter());
      System.out.println(c.circumference());
      sc.close();
   }
    
}

