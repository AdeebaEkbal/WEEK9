package ques7;
public class Manager extends Employee
{
    String department;
    
    @Override
    void showDetails()
    {
        System.out.println("Name:" +name);
        System.out.println("Salary:" +salary);
        System.out.println("Department:" +department);
    }
}
