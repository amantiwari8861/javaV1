// import java.lang.ArrayIndexOutOfBoundsException;
public class exception2 {
public static void main(String[] args) {
//exception and error 
//checked (compile time ) and unchecked (runtime )

    int arr[]=new int[3]; //3
    System.out.println("this code will run ");
    System.out.println("the value at arr[3] is "+arr[3]); //accesing 4th position exception occured at this line 

    System.out.println("this code will not work");
}
}