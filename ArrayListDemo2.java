import java.util.*;

class ArrayListDemo2
{
    public static void main(String[] args) {
        
        ArrayList<String> Name=new ArrayList<String>();
        Name.add("Aman");
        Name.add("Aaman");
		Name.add("Rohan");
		Name.add("Rohan1");
		Name.add("rohan1");
		Name.add("Rohan2");
		Name.add("s");
		Name.add("1");
		Name.add("B");
        Collections.sort(Name);
        Iterator objIterator=Name.iterator(); //getting the iterator
        while (objIterator.hasNext()) {
            System.out.println(objIterator.next());  
        }
    }
}
//iterator works on array ?