package Arrrayy;

public class TwoDArray {
    public static void main(String[] args) {
        //int a[][]=new int[3][4];
        int a[][]={{1,2,3,12},{4,5,6,11},{7,8,9,10}};
       /*  System.out.println(a.length);
        for (int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        } */


        //using for each loop

        for(int x[]:a){
            for(int y:x){
                System.out.print(y+" ");

            }
            System.out.println("");

        }
    }
    
}
