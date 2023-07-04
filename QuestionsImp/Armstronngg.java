package QuestionsImp;
import java.util.Scanner;

public class Armstronngg {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the number to check the number is armstrong or not: ");
        n=sc.nextInt();
        int m=n;
        int summ=0,r;
        while(n>0){
            r=n%10;
            summ=summ+r*r*r;
            n=n/10;
        }
        if(summ==m){
        System.out.println("Yes the no" + m +"is armstrong");
        }
        else{
            System.out.println("No the no" + m +"is armstrong");
        }
        sc.close();
        
    }   
}
