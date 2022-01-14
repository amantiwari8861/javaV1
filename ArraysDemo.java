import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {
        
        int arr[]={10,20,30,40,50,30,20};
        int arr2[]={10,20,30,40,50,660};
        int arr4[]={10,20,30,40,50,660};
        int arr3[]=new int[arr.length];
        // System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 30));
        System.out.println(Arrays.equals(arr, arr2));
        // Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[10, 20, 20, 30, 30, 40, 50]
        System.out.println(Arrays.binarySearch(arr, 3,arr.length-1, 30));//4
        System.arraycopy(arr, 1, arr3,2, 4);
        System.out.println(Arrays.toString(arr3));//[0, 0, 20, 20, 30, 30, 0]
        System.out.println(Arrays.compare(arr4, arr2));
    }
}