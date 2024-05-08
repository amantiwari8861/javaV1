abstract class Student 
{
    abstract double getPercentage();
}
class A extends Student
{
    int marks[];
    A(int marks[]){
        this.marks=marks;
    }
    @Override
    double getPercentage() 
    {
        int sum=0;
        for (int i = 0; i < marks.length; i++) 
        {
            sum+=marks[i];
        }
        return sum/marks.length;
    }
}
class B extends Student
{
    int marks[];
    B(int marks[]){
        this.marks=marks;
    }
    @Override
    double getPercentage() 
    {
        int sum=0;
        for (int i = 0; i < marks.length; i++) 
        {
            sum+=marks[i];
        }
        return sum/marks.length;
    }
}

public class Abstraction 
{
    public static void main(String[] args) 
    {
        Student stu=new A(new int[]{10,20,30});
        System.out.println(stu.getPercentage());
        stu=new B(new int[]{10,20,30,40});
        System.out.println(stu.getPercentage());
    }
}