import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        // int arr[5]; //error
        int arr[]=new int[5];//same as line no 10 or 11
        // int []arr=new int[5];//same as line no 9 or 11
        // int[] arr=new int[5];//same as line no 9 or 10

        // int []arr={10,20,30,40,50};
        // int []arr=new int[]{10,20,30,40,50};
        // int [5]arr={10,20,30,40,50}; //error

        // arr[0]=2000;
        System.out.println("the length of array is "+arr.length);
        
        System.out.println("Enter the value :");
        for (int i = 0; i < arr.length; i++) {
            
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("the value at arr["+i+"] is "+arr[i]);
        }

        // for (int i : arr) {   //iterator
        //     System.out.println(i);
        // }
    }
}