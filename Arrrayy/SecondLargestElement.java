package Arrrayy;

public class SecondLargestElement {
    public static void main(String[] args) {
        int a[]={100,55000,1002547,15,2002457};
        int max1,max2;
        max1= max2=a[0];
        for (int i=0;i<a.length;i++){
            if (a[i]>max1){
                max2=max1;
                max1=a[i];

            }
            else if(a[i]>max2){
                max2=a[i];
            }
        }
        System.out.println("Second largest element: "+max2);
    }
    
}
