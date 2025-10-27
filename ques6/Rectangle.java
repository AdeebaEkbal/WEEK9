package ques6;
public class Rectangle extends Shape
{
    int length;
    int breadth;
    
    @Override
    void area()
    {
        int area=length*breadth;
        System.out.println("Area of rectangle:" +area);
    }
}
