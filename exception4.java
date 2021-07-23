public class exception4 {
    public static void main(String[] args) {
    
        try
        {
            int arr[]=new int[3]; //3
            System.out.println("this code will run ");
            try
            {
                System.out.println("the value at arr[3] is "+arr[3]); //accesing 4th position exception occured at this line 
            }
            catch(ArrayIndexOutOfBoundsException a)
            {
                // a.getMessage(); this is   working 
                System.out.println("pls access the right index of array !");
                // a.printStackTrace();
            }
            System.out.println("this code will   work");
            System.out.println("this code will   work");
            System.out.println("this code will   work");
            System.out.println("this code will   work");
            System.out.println("this code will   work");
            System.out.println("this code will   work");
        }
        catch( Exception abc  )
        {
            System.out.println("u r accesing wrong index position ");
            System.out.println(abc.getMessage());
        }
        System.out.println("this code will work");
    }
}