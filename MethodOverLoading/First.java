package MethodOverLoading;

public class First {
    int max(int a,int b){
        return a+b;
    }
    float max(float a,float b){
        return a+b;
    }
    int max(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        First f=new First();
        System.out.println(f.max(10,20));
        System.out.println(f.max(10.5f, 20.5f));
        System.out.println(f.max(10,20,30));
        
    }
    
}
