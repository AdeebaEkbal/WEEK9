package ques3;
public class Account 
{
    int Id;
    String Account_holder_name;
    String Address;
    
    void Methodsdeposit()
    {
        
    }
    void withdraw()
    {
        
    }
    static void calculateSimpleInterest(int p, int r, int t)
    {
        double SI=(p*r*t)/100;                          //int/double
        System.out.println("Simple interest:" +SI);
    }                             
    static void calculateCompoundInterest(int p, int r, int t, int n)
    {
        double CI =(p*Math.pow(1+r/t,n*t))-p;           //only double
        System.out.println("Compound interest:" +CI);
    }
}
