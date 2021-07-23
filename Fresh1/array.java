import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        // int arr[5]; //error
        int arr[]=new int[5];
        // int []arr=new int[5];
        // int[] arr=new int[5];
        // int[] arr=new int[]; //error
        // int arr[]={10,20,30};
        // int arr[3]={10,20,30}; //error
        System.out.println("Enter value in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=obj.nextInt();
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
