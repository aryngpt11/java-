//package NIET4;
//oops means real world problem solving hmara jo code hai wo directly solve kare jo ki real world problem hoti hai jb hm actual me real world prblm ko solve krne jayenge to pta chlega value of oops
class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("MY id is "+ id);
        System.out.println("MY name is "+ name);
        System.out.println("My salaryis "+salary);
    }
    
}
public class OOPS1 {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee Aryan=new Employee();
        Employee Arya=new Employee();
        Aryan.id=11;
        Arya.id=27;
        Arya.salary=27;
        Aryan.salary=12;
        Arya.name="Arya";
        Aryan.name="Aryan";
        //System.out.println(Aryan.id);
        //System.out.println(Aryan.name);
        Aryan.printDetails();
        Arya.printDetails();
        

    }

}
