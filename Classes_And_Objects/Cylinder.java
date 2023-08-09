package Classes_And_Objects;

import java.util.*;

class Cylinder1{
    public double r;
    public double h;
    public double lidarea(){
        return Math.PI*r*r;
    }
    public double surfaceArea(){
        return 2*lidarea()+circumference()*h;
    }
    public double circumference(){
        return 2*Math.PI*r;
    }
    public double volume(){
        return lidarea()*h;
    }
}

public class Cylinder {
    public static void main(String[] args) {
        Cylinder1 c=new Cylinder1();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr the value of r: ");
        double radius=sc.nextDouble();
        System.out.print("Enetr the value of h: ");
        double height=sc.nextDouble();
        c.r=radius;
        c.h=height;
        System.out.println(c.lidarea());
        System.out.println(c.surfaceArea());
        System.out.println(c.circumference());
        System.out.println(c.volume());
        sc.close();
        
    }
    
}
