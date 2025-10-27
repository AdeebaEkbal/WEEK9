package ques4;
public abstract class Account 
{
    int Id;
    String Account_holder_name;
    String Address;
    
    abstract void deposit();
    
    abstract void withdraw();
   
    Account(int i,String name, String add)
    {
         Id=i;
        Account_holder_name=name;
        Address=add;
    }
}
