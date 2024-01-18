import java.util.Arrays;

class Xyz
{
    public static void main(String[] args) {
        
        // int arr[]={10,20,30,40};
        int arr[]=new int[10];
        // System.out.println(arr[0]);
        // System.out.println(Arrays.toString(arr));
        // Arrays.fill(arr, 1);
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i]=i+1;
        }
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.println(arr[i]);
        }
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);
    }
}