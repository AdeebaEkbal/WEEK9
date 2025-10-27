package ques6;
public class Circle extends Shape
{
    double radius;
    @Override
    void area()
    {
        double area=(Math.PI)*(Math.pow(radius,2));
        System.out.println("Area of circle:" +area);
    }
}
