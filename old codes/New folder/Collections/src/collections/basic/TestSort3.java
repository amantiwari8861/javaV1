package collections.basic;

import java.util.*;  
class Employee implements Comparable<Employee>{  
int rollno;  
String name;  
int age;  
Employee(int rollno,String name,int age){  
this.rollno=rollno;  
this.name=name;  
this.age=age;  
}  
//public int compareTo(Employee st){  
//if(age==st.age)  
//return 0;  
//else if(age>st.age)  
//return 1;  
//else  
//return -1;  
//}

//public int compareTo(Employee e1)
//{
//	return this.name.compareTo(e1.name);
//}
public int compareTo(Employee e1)
{
	if(this.age != e1.age)
	{
		return this.age-e1.age;
	}
	
	return this.name.compareTo(e1.name);
}


}  
//Creating a test class to sort the elements  
public class TestSort3{  
public static void main(String args[]){  
ArrayList<Employee> al=new ArrayList<Employee>();  
al.add(new Employee(101,"Vijay",23));  
al.add(new Employee(101,"Vijay",27));  
al.add(new Employee(101,"Vijay",90));  
al.add(new Employee(101,"Vijay",10));  
al.add(new Employee(106,"Sijay",27));  
al.add(new Employee(106,"Ajay",27));  
al.add(new Employee(105,"Jay",21));  

Collections.sort(al);  
for(Employee st:al){  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  
}  
}  