public class _03Relational 
{
    public static void main(String[] args) 
    {
        // Relational operator eg. <,>,<=,>=,==(equality),!= (inequality)

        int n1 = 13, n2 = 13, res;
        boolean result;

        // res = n1 < n2;// error : boolean cannot be converted to int
        // result = n1 < n2;
        // result = n1 > n2;
        // result = n1 <= n2; // same as ≤ in math
        // result = n1 >= n2;
        // result = n1 == n2;
        result = n1 != n2;
        System.out.println(result);
    }
}
