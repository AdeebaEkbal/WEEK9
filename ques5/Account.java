package ques5;
abstract class Account 
{
    int Id;
    String Account_holder_name;
    String Address;
    
    abstract void deposit(int amount);
    
    abstract void withdraw(int amount);
   
    Account(int Id,String Account_holder_name,String Address)
    {
        this.Id=Id;
        this.Account_holder_name=Account_holder_name;
        this.Address=Address;
    }
}
