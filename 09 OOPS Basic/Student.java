import java.util.Scanner;
class Student
{
    int id;
    String name;
    void input()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the value in id and name ");
        id=obj.nextInt();
        name=obj.next();
    }
    void showDetails()
    {
        System.out.println("the id and name of student is "+id+" "+name);
    }
}

class Main
{
    public static void main(String[] args) {
        Student apurv=new Student();
        apurv.input();
        apurv.showDetails();
    }
}