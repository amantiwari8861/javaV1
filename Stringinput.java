import java.util.Scanner;
import java.util.Arrays;

class StringDemo
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name1=sc.next();
        System.out.println("the name is "+name1);


        int arr[]={10,5,3,2,4};
        Arrays.sort(arr);
       System.out.println(Arrays.toString(arr));
    }
}