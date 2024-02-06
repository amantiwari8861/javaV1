class Teacher
{
    //method overloading : a concept of OOPs in which we can create multiple methods of the same name in the same class, and all methods work in different ways by changing the no. of arguments(parameter) or the data-type of Argument(parameter)
    void doSomething()
    {
        System.out.println("go and take rest");
    }
    void doSomething(String course)
    {
        System.out.println("Teaching "+course);
    }
    void doSomething(String course,int noOfStudents)
    {
        System.out.println("Teaching "+course+" to "+noOfStudents+" Students.");
    }
    void doSomething(String course,String stuName)
    {
        System.out.println("Teaching "+course+" to "+stuName);
    }
    // void doSomething(String stuName,String course) //error
    // {
    //     System.out.println("Teaching "+course+" to "+stuName);
    // }
    void doSomething(String stuName,String course,float fee)
    {
        System.out.println("Teaching "+course+" to "+stuName+" in "+fee+" Rupees.");
    }
    void doSomething(double salary)
    {
        System.out.println("go on manali trip");
    }
    void doSomething(float salary)
    {
        System.out.println("go on Jammu Kashmir trip");
    }
    void doSomething(int duration)
    {
        System.out.println("going to finish this course in "+duration+" hours");
    }
    void doSomething(byte duration)
    {
        System.out.println("going on tea break");
    }

}
public class OverLoading {

    public static void main(String[] args) {
        
        //Poly -> Many 
        //Morphs -> forms

        // Teacher t=new Teacher();
        // t.doSomething();
        // t.doSomething("Java");
        // t.doSomething("Java",50);
        // t.doSomething("Java","Sugandha");
        // t.doSomething("Sugandha","java",15000);
        // t.doSomething("Python");
        // t.doSomething(50000.56);
        // t.doSomething((byte)15);
        // t.doSomething(15000);
        // t.doSomething(15000.0);
        // t.doSomething(15000.0f);
        // System.out.println(10);
        // System.err.println("Aman");
        // System.out.println(33.45);
    }
}