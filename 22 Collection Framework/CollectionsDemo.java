import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionsDemo {
    public static void main(String[] args) {
        
        /* Collection col=new ArrayList();//raw type
        col.add("A");
        col.add(10);//10 is of type Integer
        col.add(true);
        System.out.println("ArrayList : "+col);
        // System.out.println(col.getClass().getName() +" class object");

        for (Object object : col)
        {
            System.out.println(object.getClass().getName() +" class object");
        }
 */
        //Generic :
        Collection<String> col2=new ArrayList<String>();//generic type (<> operator)
        col2.add("A");
        col2.add("m");
        // col2.add(123.54);//double is not of type String
        // System.out.println("ArrayList<String> : "+col2);

        for (String object : col2)
        {
            System.out.println(object);
        }
        // col2.stream().forEach(e-> System.out.println(e));
        col2.stream().forEach(e-> {
            System.out.print("value :");
            System.out.println(e);
        });
        Iterator<String> itr=col2.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        ArrayList<String> alist=new ArrayList<String>();
        alist.add("A");
        alist.add("m");
        alist.add("a");
        alist.add("n");

        for (int i = 0; i < alist.size(); i++) {
            System.out.println(alist.get(i));
        }
    }
}
