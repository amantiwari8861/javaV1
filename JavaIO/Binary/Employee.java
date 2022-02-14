import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable {
    int age=21;
    String name="Steve";
    private int salary=15000;
    void readwrite (Employee e)
    {
        try{
        FileOutputStream F=new FileOutputStream("Pi.ser");
        ObjectOutputStream S=new ObjectOutputStream(F);
        S.writeObject(e);
        S.close();
        }
        catch(IOException e1)
        {
            e1.printStackTrace();
        }
        try {
            FileInputStream f=new FileInputStream("pi.ser");
            ObjectInputStream s=new ObjectInputStream(f);
            Employee a=(Employee)s.readObject();
            System.out.println("desirialized employee object from pi.ser ");
            System.out.println("Employee name :"+e.name);
            System.out.println("Employee age :"+e.age);
            System.out.println("Employee salary :"+e.salary);
            s.close();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    
    }
    public static void main(String[] args) {
        
        Employee e2=new Employee();
        Employee e3=new Employee();
        e2.readwrite(e3);
    }
}