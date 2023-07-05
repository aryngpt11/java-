package Patterns;

public class ReverseNumPattern2 {
    public static void main(String[] args) {
        int c=0;
        for (int i=1;i<=5;i++){
            for(int j=1;j<=5-i+1;j++){
                c++;
                //System.out.print(c+" ");
                System.out.format("%02d ",c);
                
            }
            System.out.println("");
        }
    }
}
