public class finally1 {
    public static void main(String[] args) {
        int arr[]=new int[3]; //3
        try{
        System.out.println("this code will run ");
        System.out.println("the value at arr[3] is "+arr[3]); //accesing 4th position exception occured at this line 
    
        System.out.println("this code will not work");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("accesing wrong index ");
        }
        finally
        {
            System.out.println("i will run always");
        }
    }
}