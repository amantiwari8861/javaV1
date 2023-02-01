import java.util.ArrayList;

class ArrayListDemo3
{
    public static void main(String[] args) {
        
        ArrayList<String> Name=new ArrayList<String>();
        Name.add("Aman");
		Name.add("Rohan");
		Name.add("Rohan1");
		Name.add("rohan1");
		Name.add("Rohan2");
		Name.add("s");
		Name.add("1");
		Name.add("B");
        System.out.println("0th element is "+Name.get(0));
        Name.set(2, "Rohit");
        for (String string : Name) {
			System.out.println(string);
		}
    }
}