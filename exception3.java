public class exception3 {
    public static void main(String[] args) {
    
        try
        {
            int arr[]=new int[3]; //3
            System.out.println("this code will run ");
            System.out.println("the value at arr[3] is "+arr[3]); //accesing 4th position exception occured at this line 
            System.out.println("this code will not work");
        }
        // catch( ArrayIndexOutOfBoundsException abc  )
        catch( ArithmeticException | ArrayIndexOutOfBoundsException abc  )
        {
            System.out.println("u r accesing wrong index position ");
            System.out.println(abc.getMessage());
        }
        catch(Exception xyz)
        {
            System.out.println("hello i am parent of all Exceptions ");
            xyz.printStackTrace();
        }
    }
}
//try consists of suspicious codes
//catch consists codes used to handle that exception