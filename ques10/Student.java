package ques10;
public class Student 
{
    int rollNo;
    String name;
    int marks;
    static String schoolName="Senior Secondary School";
    
    public Student(int rollNo,String name,int marks)
    {
        this.rollNo=rollNo;
        this.name=name;
        this.marks=marks;
    }
    public static void changeSchoolNmae(String newschoolName)
    {
        schoolName=newschoolName;
    }
    public void print()
    {
        System.out.println("rollNo:" +rollNo);
        System.out.println("Name:" +name);
        System.out.println("marks:" +marks);
        System.out.println("schoolName:" +schoolName);
    }
}
