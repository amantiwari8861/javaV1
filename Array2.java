import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) {
        
        Scanner obj=new Scanner(System.in);
        // int arr[5]; //error
        // int arr[]=new int[5];
        // int []arr=new int[5];
        int[] arr=new int[5];

        // int []arr={10,20,30,40,50};
        // int [5]arr={10,20,30,40,50}; //error

        // arr[0]=2000;
        System.out.println("Enter the value :");
        for (int i = 0; i < arr.length; i++) {
            
            arr[i]=obj.nextInt();
        }

        for (int i : arr) {   //iterator
            System.out.println(i);
        }
    }
}