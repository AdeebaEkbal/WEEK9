package ques2;
public class Department extends Faculty
{
    String name;
    String chairman;
    
    void Details()
    {
        System.out.println("Name of department: " +name);
        System.out.println("Name of chairman: " +chairman);

    }
    
    void Display()
    { 
        super.Details();
        this.Details();
        System.out.println("University ranking: " +ranking);
    }
}
