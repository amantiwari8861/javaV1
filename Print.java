import java.io.PrintWriter;
public class Print {
public static void main(String[] args) {
    
    int i=50;
    System.out.println("any msg");
    System.out.printf("hello world  %d \n",i);
    PrintWriter aman=new PrintWriter(System.out,true);
    aman.println("hello everyone ");
    aman.print("\t hii \t ");
    aman.printf("hii i am printf \n");
}    
}
