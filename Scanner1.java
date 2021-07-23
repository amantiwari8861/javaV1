import java.util.Scanner;
public class Scanner1 {
public static void main(String[] args) {
    
    Scanner obj=new Scanner(System.in);
    int a=obj.nextInt();
    float f=obj.nextFloat();
    double d=obj.nextDouble();
    char ch=obj.next().charAt(0);
    String str=obj.next();
    String str2=obj.nextLine();
    byte b=obj.nextByte();
    boolean bool=obj.nextBoolean();
    short s=obj.nextShort();
    long l=obj.nextLong();
}  
}