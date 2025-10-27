package ques2;
public class main2 
{ 
    public static void main(String[] args) 
    {
        Department d1=new Department();
        d1.chairman="Armaan Rasool Faridi";
        d1.name="CS";
        d1.ranking=4;
        
        ((University)d1).name="AMU";            //type casting
        ((Faculty)d1).name="Faculty of Science";

        d1.Display();
    }
}