import java.util.Arrays;
import java.util.Scanner;
// import java.util.logging.Logger;

public class BinarySearch 
{

    public static int binarySearch(int[] arr,int key,int low,int high) throws Exception
    {
        if(low<=high)
        {
            int mid=(low+high)/2;
            // System.out.println("low:"+low+" high:"+high+" mid:"+mid+" "+arr[mid]+"=="+key);
            if (arr[mid]==key) 
                return mid;
            if (key>arr[mid]) 
            {
                low=mid+1;
            }
            if (key<arr[mid]) 
            {
                high=mid;
            }
            return binarySearch(arr, key, low, high);
        }
        return -1;
    }
    public static void main(String[] args) throws Exception
    {
        // Logger logger=Logger.getLogger(BinarySearch.class.getName());
        int arr[]={45,67,68,98,34,87,94};
        int key;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter key:");
        key=sc.nextInt();
        Arrays.sort(arr);
        System.out.println("Sorted Array:"+Arrays.toString(arr));
        int pos=binarySearch(arr,key,0,arr.length-1);
        System.out.println("Found at position :"+pos);
        // logger.info("Found at position :"+pos);
        sc.close();
    }
}