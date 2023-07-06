package Arrrayy;

public class FindMAxElement {
    public static void main(String[] args) {
        int a[]={100,55000,1002547,15,2002457};
        int max=a[0];
        for (int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);
    }
    
}
