package Classes_And_Objects;

import java.util.Scanner;
class Stud{
    public int roll_no;
    public String name;
    public String course;
    public int m1,m2,m3;
    public int total(){
        return m1+m2+m3;
    }
    public float average(){
        return (float)total()/3;
    }
    public char grade(){
        if(average()>=60){
            return 'A';
        }
        else{
            return 'B';
        }

    }
}
public class Student {
    public static void main(String[] args) {
        Stud s=new Stud();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of m1: ");
        int M1=sc.nextInt();
        System.out.print("Enter the value of m2: ");
        int M2=sc.nextInt();
        System.out.print("Enter the value of m3: ");
        int M3=sc.nextInt();
        s.m1=M1;
        s.m2=M2;
        s.m3=M3;
        System.out.println("The total no in the subjects are: "+ s.total());
        System.out.println("The average in three subjects are: " +s.average());
        System.out.println("The grade are: "+s.grade());
        sc.close();
        
    }
    
}

