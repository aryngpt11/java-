package Constructorss;

class Cylinder{
    private double radius;
    private double height;
    public Cylinder(){
        radius=1;
        height=1;
    }
    public Cylinder(double r, double h){
        setRadius(r);
        setHeight(h);
    }
    public double getRadius(){
        return radius;
    }
    public double getHeight(){
        return height;
    }
    public void setRadius(double r){
        if (r>=0)
          radius=r;
        else
            radius=0;
    }
    public void setHeight(double h){
        if (h>=0)
           height=h;
        else
             height=0;
    }
    public double area(){
        return Math.PI*radius*radius*height;
    }
}
public class CylinderFinding {
    public static void main(String[] args) {
        Cylinder c=new Cylinder(-10,-25);
        System.out.println(c.area());
    }
    
}
