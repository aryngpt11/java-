package VariableArguments;

public class MAxx {
    int max(int ...A){
        if(A.length==0){
            return Integer.MIN_VALUE;
        }
        int max=A[0];
        for (int i=1;i<A.length;i++){
            if(A[i]>max){max=A[i];}
        }
        return max;
    }
    public static void main(String[] args) {
        MAxx m=new MAxx();

        System.out.println(m.max());
        System.out.println(m.max(10,20));
        System.out.println(m.max(10,20,30));
        System.out.println(m.max(10,20,30));
    }
    
}
