import java.lang.reflect.Method;

//Parent Class
class Engineer {
    String function = "Pre-sales"; //Attribute
    int salary = 50000; //Attribute
    // Method of Parent's class
    void researching(){
        System.out.println("Engineer researching");
    }
}
//Child Class. We can see 'extends'
class ElectricalEngineer extends Engineer{
    String expert = "High Voltage"; //Attribute
    int    YearOfExp = 3; //Attribute

    // Method of Child's class
    void DoingElectricalDrawing(){
        System.out.println("Electrical Engineer doing electrical drawing");
    }
}

//Main class to test Inheritance
public class CheckingInheritance1 {
    public static void main(String[] args){
        ElectricalEngineer eEng = new ElectricalEngineer();
        //accessing the fields of parent class
        System.out.println("the main function of the Engineer "+eEng.function);
        System.out.println("the Salary of the Engineer "+eEng.salary);

        //accessing the fields of child class
        System.out.println("the Electrical Engineer is expert on "+eEng.expert);
        System.out.println("the Electrical Engineer has "+eEng.YearOfExp+" of experience ");

        //accessing method's of parent & child class
        eEng.researching();
        eEng.DoingElectricalDrawing();

    }
}
