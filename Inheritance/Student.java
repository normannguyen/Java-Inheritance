
/*Program:  Inheritance
/*CIS163AA
/*EXAMPLE   
/*03/02/2018 
/*This program creates a base class and uses inheritance to create a subclass
*/
public class Student extends Person
{
    // initialize variable
    private int studentID;

    /**
     * Constructor for objects of class Student
     */
    public Student()//default constructor sets all variables to zero or null
    {        
        super(); // calls base Person constructor
        studentID = 0;  
    }
    
    public Student(int age, int height, int weight, int number)
    {
        super(age, height, weight);
        studentID = number;
    }

    /*   
     * Standard setter and getter for the subclass
    */
    public void setID(int num)
    {        
        studentID = num;
    }
    
    public int getID()
    {
        return studentID;
    }
    // overrides the printAll method from the base class to include the student ID
    @Override 
    public void printAll()
    {
        super.printAll();
        System.out.println("Student ID is: " + studentID);
    }
}
