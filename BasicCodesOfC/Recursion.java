public class Recursion {

    
    public static int rec1(int l,String str,int r)
    {
        char arr[]=str.toCharArray();
        if(arr[l] == arr[r])
        {
            return 1;
        }
        if(arr[l] != arr[r])
        {
            return 0;
        }
        if (r>l) 
        {
            return 1;
        }

        rec1(l+1, str, r-1);
        return 0;
    }
    public static void main(String[] args) 
    {
        String str="12121";
        int n=rec1(0,str,str.length()-1);

        if (n==1) {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
    }
}
