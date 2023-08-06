package VariableArguments;

public class Secont {
    void showList(String ...S){
        /* for(String a:S){
            System.out.println(a);
        } */
        for(int i=0;i<S.length;i++){
            System.out.println(i+1+". "+S[i]);
        }
    }
    public static void main(String[] args) {
        Secont s=new Secont();
        s.showList("Aryan","Arya","Prince","Juli","Raj","Shweta");
    }
    
}
