import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

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
class Method1 
{
    public static void main(String[] args) {
        Iterator<String>  itr;
        List<String> students=Collections.synchronizedList(new ArrayList<>());
        // CopyOnWriteArrayList<String> students= new CopyOnWriteArrayList<String>();

        Thread t1=new Thread(new AddStudent(students,"Aman"));
        t1.start();
        Thread t2=new Thread(new AddStudent(students,"Kashvi"));
        t2.start();
        Thread t3=new Thread(new AddStudent(students,"Dev"));
        t3.start();

        synchronized(students)
        {
            itr=students.iterator();
            while (itr.hasNext()) 
            {
                System.out.println(itr.next());
            }
            System.out.println(students);
        }
        System.out.println(students);
        // Iterator<String>  st=students.iterator();
        // while (st.hasNext()) 
        // {
        //     System.out.println(st.next());
        //     // st.remove();  //Error
        // }
        // System.out.println(students);
    }
}