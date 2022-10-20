public class sum_natural{
    public static void main (String[]args){
        int a=1234;
        int sum=0;
        while (a>0){
            System.out.println(a%10);
            sum +=a%10;
            a=a/10;
        }
        System.out.print(sum);
    }
}