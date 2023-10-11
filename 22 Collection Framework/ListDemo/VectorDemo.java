import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

class AddFriendsThread implements Runnable
{
    public int num;
    List<String> frnds;
    AddFriendsThread(List<String> frnds,int num)
    {
        this.frnds=frnds;
        this.num=num;
    }
    @Override
    public void run()
    {
        frnds.add("Aman "+num);
    }
}
public class VectorDemo 
{
    public static void main(String[] args) throws Exception
    {
        
        List<String> friends1=new ArrayList<>();
        List<String> syncArr=Collections.synchronizedList(new ArrayList<>());
        List<String> friends2=new Vector<>();
        Thread t1=null,t2=null;

        for (int i = 1; i <= 10; i++) 
        {
            // t1 = new Thread(new AddFriendsThread(friends1, i));
            t1 = new Thread(new AddFriendsThread(syncArr,i));
            t1.start();
            t2 = new Thread(new AddFriendsThread(friends2, i));
            t2.start();
        }

        // Wait for all threads to finish
        t1.join();
        t2.join();

        System.out.println("ArrayList (friends1): " + friends1);
        System.out.println("ArrayList (friends1): " + syncArr);
        System.out.println("   Vector (friends2): " + friends2);

    }   
}
