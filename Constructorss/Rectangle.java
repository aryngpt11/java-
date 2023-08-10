package Constructorss;
class Rectangle1{
    private double length;
    private double breadth;
    public Rectangle1(){
        length=1;
        breadth=1;
    }
    public Rectangle1(double l,double b){
        length=l;
        breadth=b;
    }
    public Rectangle1(double s){
        length =breadth=s;

    }
   /*  public double getL(){
        return length;
    }
    public double getB(){
        return breadth;
    }
    public void setL(double l){
        length=l;
    }
    public void setB(double b){
        breadth=b;
    } */
    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
    public boolean isSquare(){
        return length==breadth;
    }
}

public class Rectangle {
    public static void main(String[] args) {
        Rectangle1 r=new Rectangle1(10,15);
        System.out.println(r.area());
    }
    
}
