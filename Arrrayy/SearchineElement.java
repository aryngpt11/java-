package Arrrayy;

public class SearchineElement {
    public static void main(String[] args) {
        int key=15;
        int []a={10,50,70,15,99};
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                System.out.println("element is found at index "+i);
                System.exit(0);
            }
           
        }
        System.out.println("not found");
    }
}
