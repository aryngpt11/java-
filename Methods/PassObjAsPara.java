package Methods;

public class PassObjAsPara { 
    static void update(int a[]){
        a[0]=29;
    }
    public static void main(String[] args) {
        int a[]={2,3,4,5,6,7,8};
        update(a);
        System.out.println(a[0]);
        for (int i=0;i<=a.length-1;i++){
            System.out.print(a[i]+",");
        }
    }
    
}
