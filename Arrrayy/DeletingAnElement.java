package Arrrayy;

public class DeletingAnElement /* {
    public static void main(String[] args) {
        int a[]={8,6,10,9,2,15,7,1,14,11};
        int b[]=new int[10];
        for (int i=0;i<a.length;i++){
            b[i]=a[i];
            System.out.print(b[i]+" ");
        }

        a=b;

    }
     */
    {
        public static void main(String[] args) 
        {
            int A[]={8,6,10,9,2};
            
            System.out.println("Length of A="+A.length);
            
            int B[]=new int[10];
            
            for(int i=0;i<A.length;i++)
            {
                B[i]=A[i];
            }
            A=B;
            
            System.out.println("Length of A="+A.length);
            A[8]=150;
            
        }
}
