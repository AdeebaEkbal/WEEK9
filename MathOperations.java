package ques9;
public class MathOperations 
{
    static int findGCD(int a,int b)
    {
        if(b==0)
            return a;
        else return findGCD(b,a%b);
    }
    
    static int findLCM(int a, int b)
    {
        if(a==0||b==0)
            return 0;
        int product=a*b;
        int gcd=findGCD(a,b);
        return (product/gcd);
    }
}
