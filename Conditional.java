import java.util.Scanner;
class conditional {
	public static void main(String args[])
	{
	Scanner obj=new Scanner(System.in);
	// int amount=obj.nextInt();
	char ch=obj.next().charAt(0);
    switch(ch)
    {
        case 'a':System.out.println("a");
        case 'e':System.out.println("e");
        case 'i':System.out.println("i");
        case 'o':System.out.println("o");
        case 'u':System.out.println("u");
                System.out.println("vowels");
                break;
        default:System.out.println("special case ");
    }
    // String abc=obj.next();
    //String abc2=obj.nextLine();
    // System.out.println("the ch is "+ch+"  "+abc2);
    //System.out.println("the string is "+abc2);
	}
}