import java.util.Scanner;
public class Switch1 {
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number ");
		
		//char xyz[]=new char[6];
	
       String xyz=obj.nextLine();
        int count=0,sp=0;
    for(int i=0;i<xyz.length();i++)
    {
        switch(xyz.charAt(i))
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': count++;
            break;
            default:sp++;
        }
    }
      System.out.println("the value is "+xyz+" the length is :"+xyz.length());
      System.out.println("the no. of vowels  is "+count+" and sp : "+sp);
	}
}
