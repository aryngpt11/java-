package DataHiding;
import java.util.Scanner;

class Square1{
    private double length;
    
    public double getLength(){
        return length;
    }
    public void setLength(double l){
        length=l;
    }
    public double area(){
        return length*length;
    }
    public double perimeter(){
        return 4*(length);
    }
}
public class Square {
    public static void main(String[] args) {
        Square1 s=new Square1();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr the value of length: ");
        double lenn=sc.nextDouble();
        s.setLength(lenn);
        System.out.println("The area of square is: "+s.area());
        System.out.println("The perimeter of square is: "+s.perimeter());
        sc.close();
        
    }
    
}
