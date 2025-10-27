package ques5;
class Saving extends Account
{
    int  Min_balance;
    
    Saving(int Id,String Account_holder_name,String Address,int  Min_balance)
    {
        super(Id,Account_holder_name,Address);
        this.Min_balance=Min_balance;
    }
    
    void display()
    {
        System.out.println("Id:" +Id);
        System.out.println("Account holder name:" +Account_holder_name);
        System.out.println("Address:" +Address);
        System.out.println("Minimum balance:" +Min_balance);
        System.out.println();
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
