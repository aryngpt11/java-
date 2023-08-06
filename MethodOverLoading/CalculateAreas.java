package MethodOverLoading;

public class CalculateAreas {
    double area(double l,double b){
        return l*b;
    }
    double area(double r){
        return Math.PI*r*r;
    }
    float area(float a){
        return a*a;
    }
    double area(double a, double b, double h){
        return 0.5*(a+b)*h;
    }
    public static void main(String[] args) {
        CalculateAreas ca=new CalculateAreas();
        System.out.println(ca.area(5,8));
        System.out.println(ca.area(16));
        System.out.println(ca.area(55f));
        System.out.println(ca.area(8,15,20));
      

        
    }
}
