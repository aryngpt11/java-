package Methods;

public class ObjPassing {
    static void aarr(int a[],int index,int value){
        a[index]=value;
    }
    public static void main(String[] args) {
        int a[]={10,20,30,40,50,60};
        aarr(a, 0, 11);
        System.out.println(a[0]);
        for(int x:a){
            System.out.print(x+",");
        }
        
    }
    
}
