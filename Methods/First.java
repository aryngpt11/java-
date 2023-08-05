package Methods;

public class First {
    //static method
    
    // static int max(int x,int y){
    //     if (x>y){
    //         return x;
    //     }
    //     else{
    //         return y;
    //     }
    // }

    // public static void main(String[] args) {
    //     int a=10,b=8,c;
    //     c=max(a,b);
    //     System.out.println("the max value is"+c);
       
    //         }



    //if we want to call the method without usig the static method then we have to create the object iof the class
//non static method


    int max(int x,int y){
        if(x>y){
            return x;
        }
        else{
            return y;
        }
    }
    public static void main(String[] args) {
        int a=10,b=20;
        First f=new First();
        System.out.println(f.max(a, b));
    }
        
        } 
    

