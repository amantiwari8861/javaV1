import java.util.Scanner;

class UserInput2
{
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);

    int num1=sc.nextInt();
    float f=sc.nextFloat();
    byte b=sc.nextByte();
    short s=sc.nextShort();
    long l=sc.nextLong();
    double d=sc.nextDouble();
    boolean bool=sc.nextBoolean();
    String str=sc.next();//one word
    String str2=sc.nextLine();// whole sentence(one line)
    char ch=sc.next().charAt(0);//one letter
    }
}