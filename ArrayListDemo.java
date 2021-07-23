import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
//		String arr[]=new String[5];//normal array size fixed 
		ArrayList<String> Name=new ArrayList<String>();
		
//		arr[0]="aman";
//		arr[1]="aman2";	
//		arr[2]="aman3";
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//			//or 
//		for (String string : arr) {
//			System.out.println(string);
//		}
		
		Name.add("Aman");
		Name.add("Rohan");
		Name.add("Rohan1");
		Name.add("Rohan2");
		for (String string : Name) {
			System.out.println(string);
		}
        System.out.println(Name.size());
        System.out.println("----------------------------------------------------------------");
        // Name.remove(); error no such method
        Name.remove(2);
        Name.remove("Rohan");
        Name.add(1, "sujata");
        for (String string : Name) {
			System.out.println(string);
		}
	}

}
