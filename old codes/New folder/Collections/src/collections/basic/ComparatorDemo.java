package collections.basic;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class SortById implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2) 
	{
		return o1.id-o2.id; //ascending
//		return o2.id-o1.id; //descending
	}
}
class SortByName implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) 
	{
		return o1.name.compareTo(o2.name);
	}
	
}
class CompareByIdAndName implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2) {
		int namecompres=o1.getName().compareTo(o1.getName());
		//take id as integer
		Integer idcompres=o1.getId().compareTo(o2.getId());
		return ((namecompres==0)?idcompres:namecompres);
	}
	
}

public class ComparatorDemo {
	public static void main(String[] args) {

		ArrayList<Student> students=new ArrayList<>();

		students.add(new Student(105,"man"));
		students.add(new Student(102,"Rman"));
		students.add(new Student(108,"rman"));
		students.add(new Student(106,"CAman"));
		students.add(new Student(101,"Aman"));
		students.add(new Student(103,"Aman"));
		students.add(new Student(10,"Aman"));
		students.add(new Student(102,"Raman"));
		System.out.println("-------unsorted------------");
		students.forEach(s->{
			System.out.println(s);
		});
//		Collections.sort(students, new SortById());
//		System.out.println("-------sorted by id------------");
//		students.forEach(s->{
//			System.out.println(s);
//		});
//		Collections.sort(students, new SortByName());
//		System.out.println("-------sorted by name------------");
//		students.forEach(s->{
//			System.out.println(s);
//		});
		Collections.sort(students,new CompareByIdAndName());
		System.out.println("-------sorted by id & name------------");
//		students.forEach(s->{
//			System.out.println(s);
//		});	
		
		for(Student st:students)
		{
			System.out.println(st);
		}
	}
}
