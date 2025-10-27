package ques1;
public class WEEK9 {
    public static void main(String[] args) 
    {
        Bus b1 =new Bus();
        b1.cost(60);
        b1.conductorname = "Will Jordan";
        b1.display();
        
        Train t1=new Train();
        t1.cost(6000);
        t1.noofcarriages=23;
        t1.display();
    }
}
