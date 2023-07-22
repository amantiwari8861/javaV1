import java.util.ArrayList;
import java.util.List;

class AddStudent implements Runnable
{
    String data;
    List<String> students;
    AddStudent(List<String> students,String data)
    {
        this.students=students;
        this.data=data;
    }
    @Override
    public void run() 
    {
        students.add(data);
        System.out.println("Added by "+Thread.currentThread().getName());
    }

}

public class ArrayListWithThread 
{
    public static void main(String[] args) throws Exception
    {
        
        List<String> students=new ArrayList<>();
        Thread t1=new Thread(new AddStudent(students,"Aman"));
        t1.start();
        Thread t2=new Thread(new AddStudent(students,"Kashvi"));
        t2.start();
        Thread t3=new Thread(new AddStudent(students,"Dev"));
        t3.start();
        
        t1.join();
        t2.join();
        t3.join();
        System.out.println(students);
    }
}
