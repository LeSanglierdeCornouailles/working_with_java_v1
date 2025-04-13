//Checking Inheritance
//Parent Class
class  Doctor{
    float salary = 50000; // Attribute
}
//Child Class because using 'extends' keyword
class Surgeon extends Doctor {
    float bonus = 20000; // Attribute
}
public class CheckingInheritance {
    public static void main(String[] args) {
        //Initiating Obj of child class
       Surgeon s = new Surgeon();
       System.out.println("Salary of surgeon " + s.salary);
       System.out.println("bonus of surgeon " + s.bonus);

    }
}
