package Recursion;
public class First{
   /*  static void fun(int n){
        if(n>0){
            System.out.println(n);
            fun(n-1);
        }
        
        }
        public static void main(String[] args) {
            fun(10);
    } */


    //second example of recursion
    void fun(int n){
        if(n>0){
            fun(n-1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        First f=new First();
        f.fun(10);
    }
}