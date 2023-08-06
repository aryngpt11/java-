package VariableArguments;

public class First {
    void show(int y,int ...x){
        System.out.println(y);
        for (int a:x){
            System.out.print(a+" ");
        }
        
    }
    public static void main(String[] args) {
        First f=new First();
        f.show(10,20,304,50,15,01);
        
    }
    
}
