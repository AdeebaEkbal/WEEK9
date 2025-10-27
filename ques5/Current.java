package ques5;
public class Current extends Account
{
    int Max_withdrawl_limit;
    
    Current(int Id,String Account_holder_name,String Address,int  Max_withdrawl_limit)
    {
        super(Id,Account_holder_name,Address);
        this.Max_withdrawl_limit=Max_withdrawl_limit;
    }
    
     void display()
    {
        System.out.println("Id:" +Id);
        System.out.println("Account holder name:" +Account_holder_name);
        System.out.println("Address:" +Address);
        System.out.println("Maximum withdrawl limit:" +Max_withdrawl_limit);
    }
    
    void deposit(int amount)
    {
        System.out.println("Amount:" +amount);
    }
    
    void withdraw(int amount)
    {
        System.out.println("Amount:" +amount);
    }
}
