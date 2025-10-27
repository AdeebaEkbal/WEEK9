package ques8;
public class WashingMachine extends Appliance
{
    @Override
    void turnOn()
    {
        System.out.println("Washing Machine turning on...");
    }
    
    @Override
    void turnOff()
    {
        System.out.println("Washing Machine turning off...");
    }
}
