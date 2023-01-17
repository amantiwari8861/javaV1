import java.util.ArrayList;
import java.util.Arrays;
public class ArraysDemo 
{
    public static void main(String[] args) 
    {
        int arr[]={1,2,5,45,50,6,70,55,9,10};
/* 
        //1. Arrays.toString()
        System.out.println("Arrays.toString() : "+Arrays.toString(arr));
        //2. Arrays.binarySearch()
        System.out.println("Arrays.binarySearch() : "+Arrays.binarySearch(arr,5));
        //3. Arrays.equals()
        int arr2[]={1,2,5,45,50,6,70,55,9,10};
        System.out.println("Arrays.equals() : "+Arrays.equals(arr, arr2));
        //4. Arrays.sort()
        Arrays.sort(arr);
        System.out.println("Arrays.sort() : "+Arrays.toString(arr)); 
        //5. Arrays.copyOf()
        int arr3[]=new int[arr.length];//10
        arr3=Arrays.copyOf(arr, arr3.length+5);
        System.out.println("Arrays.copyOf() : "+Arrays.toString(arr3));
        //6. Arrays.Compare()
        int arr4[]={1,2,5,45,50,6,70,55,9,10};
        int arr5[]={1,2,5,45,50,6,70,60,9,10};
        System.out.println("Arrays.Compare() : "+Arrays.compare(arr4, arr5));*/
        //7. Arrays.fill()
        // Arrays.fill(arr, 3);
        // System.out.println("Arrays.fill() : "+Arrays.toString(arr));
        //8. Arrays.copyOfRange()
        // int arr6[]=new int[arr.length];
        // arr6=Arrays.copyOfRange(arr, 2, 7);
        // System.out.println("Arrays.copyOfRange() : "+Arrays.toString(arr6));

        // ArrayList myList=new ArrayList(Arrays.asList(arr));
        // System.out.println("ArrayList : "+myList);
        // System.out.println("ArrayList : "+myList.get(2));

        Integer arr7[]={1,2,5,45,50,6,70,55,9,10};
        ArrayList alist=new ArrayList(Arrays.asList(arr7));
        System.out.println("ArrayList : "+alist);
    }
}
    

                                             