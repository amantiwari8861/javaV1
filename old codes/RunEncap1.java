package nyz.bbc;
//import com.niit.*;
import com.niit.EncapTest1;
public class RunEncap1
{
	public static void main(String args[])
	{
		EncapTest1 encap=new EncapTest1("Aman","1001",27);
		String myname=encap.getName();
		System.out.println(myname);
		System.out.println("Name : "+encap.getName()+"Age : "+ encap.getAge()+" "+encap.getIdnum());
	}
}