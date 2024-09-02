package nyz.bbc;
import com.niit.*;
import com.niit.EncapTest;
public class RunEncap
{
	public static void main(String args[])
	{
		EncapTest encap=new EncapTest();
		encap.setName("james");
		encap.setAge(20);
		encap.setIdnum("9891062743");
		String myname=encap.getName();
		System.out.println(myname);
		System.out.println("Name : "+encap.getName()+"Age : "+ encap.getAge()+" "+encap.getIdnum());
	}
}