package Arrrayy;

public class Adding2Arr {
    public static void main(String[] args) {
        int a[][]={{55,56,58},{100,200,300},{888,999,555}};
        int b[][]={{51,9,8},{1001,2050,3010},{8818,9919,5575}};
        int c[][]=new int[3][3];
        for (int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
            
        }
        for(int x[]:c){
            for(int y:x){
                System.out.print(y+" ");

            }
            System.out.println("");
        }
    }
    
}
