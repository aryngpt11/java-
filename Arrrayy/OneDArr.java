package Arrrayy;

public class OneDArr {
    public static void main(String[] args) {
        int a[]=new int[5];   //1st type
        /*int b[]={10,20,30,40,50,60};     //2nd type
        int c[];    //3rd type
        c=new int[8];*/
        a[0]=100;
        a[1]=80;
        a[2]=60;
        a[3]=40;
        a[4]=20;

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
        for(int x:a){
            System.out.print(++x+" ");
        }
    }
    
}
