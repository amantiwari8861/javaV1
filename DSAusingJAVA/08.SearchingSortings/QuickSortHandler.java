import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

class QuickSort 
{
    private static void swap(int arr[],int p1,int p2)
    {
        int temp=arr[p1];
        arr[p1]=arr[p2];
        arr[p2]=temp;
    }
    public static void sort(int arr[])
    {
        quickSortUtil(arr,0, arr.length-1);
    }
    public static void printArrRange(int arr[],int i,int j)
    {
        System.out.print("[");
        for (int k = i; k <= j; k++) 
        {
            System.out.print(arr[k]);
            if (k<j) 
                System.out.print(",");
        }
        System.out.println("]");
    }
    private static void quickSortUtil(int arr[],int low, int high)
    {
        if (low > high) return; //Base condition
        printArrRange(arr,low,high);
        int pivot = arr[low];
        int i = low + 1;
        int j = high;
        System.out.println("Pivot :"+pivot+" Low:"+low+" High:"+high);
        // Partition the list
        while (i <= j) 
        {
            while (i <= high && arr[i] <= pivot) 
            {
                i++;
            }
            System.out.println("Found "+arr[i]+" at pos "+i+" > than pivot "+pivot);
            while (j >= low && arr[j] > pivot) 
            {
                j--;
            }
            System.out.println("Found "+arr[j]+" at pos "+j+" < than pivot "+pivot);

            if (i < j) {
                System.out.println("Swapping "+arr[i]+" with "+arr[j]);
                swap(arr,i, j);
            }
            System.out.println(Arrays.toString(arr));
        }

        if (low < j) {
            System.out.println("Swapping "+arr[low]+" with "+arr[j]);
            swap(arr,low, j);
        }
        // Recursively sort the two partitions
        System.out.println("Breaking start low="+low+" j="+j);
        quickSortUtil(arr,low, j - 1);
        quickSortUtil(arr,j + 1, high);
    }
}
class QuickSortHandler
{
    public static int[] generateRandArr(int size)
    {
        int arr[]=new int[size];
        for (int i = 0; i < size; i++) 
            arr[i]=(int)(100*Math.random()+1);
        return arr;
    }
    public static void main(String[] args) {
        
        // int arr[]=generateRandArr(10);
        int arr[]={28,55,46,38,16,89,83,30};
        // System.out.println("Before Sorting :"+Arrays.toString(arr));
        // QuickSort.sort(arr);
        // System.out.println("After Sorting :"+Arrays.toString(arr));
        
        List<Integer> nums=Arrays.stream(arr).boxed().collect(Collectors.toList());
        Collections.sort(nums);
        System.out.println(nums);

    //    Collections.sort(Arrays.asList(arr),(e1,e2)->e2-e1);
    //    System.out.println(Arrays.toString(arr));
    }
}