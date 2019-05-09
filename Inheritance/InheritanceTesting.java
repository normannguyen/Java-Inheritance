
/*Program:  Inheritance
/*CIS163AA
/*EXAMPLE   
/*03/02/2018 
/*This program creates a base class and uses inheritance to create a subclass
*/
public class InheritanceTesting
{
    public static void main(String[] args) {
        // This prgram tests the methods of both the base and subclass 
        // to show how inheritance works 
        Person person1 = new Person();
        Person person2 = new Person(15, 56, 145);
        Student student1 = new Student();
        Student student2 = new Student(24, 51, 180, 83462);
        
        person1.printAll();
        person2.printAll();
        student1.printAll();
        student2.printAll();
        
    }
}
