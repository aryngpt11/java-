package QuestionsImp;
public class Pattern {
    public static void main(String[] args) {
       /* for(int i=1;i<=5;i++){
        for(int j=1;j<=5;j++){
            //System.out.print("("+i+","+j+")");
            System.out.print(j+" ");
        }
        System.out.println("");
       }  */

       //2nd type to print same no in each columns
       /* for(int i=1;i<=5;i++){
        for(int j=1;j<=5;j++){
            System.out.print(i+" ");
        }
        System.out.println("");
       } */

       //3rd type of pattern
       for(int i=1;i<=5;i++){
        for(int j=1;j<=5;j++){
            System.out.print((i+j)+" ");
        }
        System.out.println("");
       }
    }
    
}
