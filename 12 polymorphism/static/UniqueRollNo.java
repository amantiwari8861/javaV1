//static is a modifier
class Student 
{
    int rollno;
    static int num;
    static String schoolName = "Niit";
    static 
    {
        num=0;
    }
    Student() // static modifier not allowed here
    {
        incrementNum();
        rollno=1000+num;
    }
    static void incrementNum()
    {
        num++;
        // rollno=num;//we can't initialize the non-static variable here
    }
}
public class UniqueRollNo 
{
    public static void main(String[] args) 
    {
        Student stu[] = new Student[10];// here 10 blocks are created only
        // here we are not giving the memory to student type array

        for (int i = 0; i < stu.length; i++) 
        {
            // System.out.println(stu[i].schoolName);// only static data can be accessed without giving memory
            System.out.println(Student.schoolName);//static variables relates to class type not object type
            // for giving memory we must use new keyword
            stu[i]=new Student();//giving memory to array (try toggling this comment)
            System.out.println(stu[i].rollno);
        }
    }
}