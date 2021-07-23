import java.util.Arrays;

public class Oops1 {

    public static void main(String[] args) {
        
        int arr[]={50,80,60,90,10,30,40};
        int arr2[]={50,80,60,90,10,30,40};
        Arrays.sort(arr);
        Arrays.sort(arr2);
        // for (int i : arr) {
        //     System.out.println(i);
        // }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 90));
        System.out.println(Arrays.compare(arr, arr2));
        // arr  50<90 arr2 -1
        // arr  50>20 arr2  1
        // arr  50=50 arr2  0
        System.out.println(Arrays.equals(arr, arr2));
    }
    
}