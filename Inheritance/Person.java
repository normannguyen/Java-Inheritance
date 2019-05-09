
/*Program:  Inheritance
/*CIS163AA
/*EXAMPLE  
/*03/02/2018 
/*This program creates a base class and uses inheritance to create a subclass
*/
public class Person
{
    // protected allows the subclass to use the variables
    protected int age, height, weight;    

    /**
     * Constructor for objects of class Person
     */
    public Person()// initialize instance variables to zero for default constructor
    {        
        age = 0;
        height = 0;
        weight = 0;
    }
    
    public Person(int age, int height, int weight)
    {
        // initialize instance variables
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    /*
     * Standard setters for the class
    */
    public void setAge(int age)
    {
        // put your code here
        this.age = age;
    }
    
    public void setHeight(int height)
    {
        this.height = height;
    }
    
    public void setWeight(int weight)
    {
        this.weight = weight;
    }
    
    //Standard getters for the class
    public int getAge()
    {
        return age;
    }
    
    public int getHeight()
    {
        return height;
    }
    
    public int getWeight()
    {
        return weight;
    }
    
    
    public void printAll()
    {
        System.out.println("Age is: " + age);
        System.out.println("Height is: " + height + " in inches");
        System.out.println("Weight is: " + weight + " in pounds");
    }
}
