package ques8;
public class Refrigerator extends Appliance
{
    @Override
    void turnOn()
    {
        System.out.println("Refrigerator turning on...");
    }
    
    @Override
    void turnOff()
    {
        System.out.println("Refrigerator turning off...");
    }
}
