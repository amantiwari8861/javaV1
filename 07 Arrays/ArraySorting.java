import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) 
    {
        // int arr[]={10,50,90,70,8,1};
        // String arr[]={"Harsh Shukla","Aman Tiwari","Harsh Kasana","harsh","Khushi shukla","aayush"};
        // Arrays.sort(arr);
        // for (int i : arr) 
        // {
        //     System.out.println(i);
        // }

        //Bubble Sort
        // for (int i = 0; i < arr.length-1; i++) //5
        // {
        //     for (int j = 0; j < arr.length-i-1; j++) // 6-1-1
        //     {
        //         // if (arr[j]<arr[j+1])
        //         if(arr[j].compareTo(arr[j+1]) >= 0)
        //         {
        //             // int temp=arr[j];
        //             String temp=arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]=temp;
        //         }
        //     }
        // }

        // System.out.println(Arrays.toString(arr));
        // System.out.print("the sorted array is :[");
        // for (int i = 0; i < arr.length; i++) 
        // {
        //     System.out.print(arr[i]);
        //     if (i<arr.length-1) 
        //     {
        //         System.out.print(", ");
        //     }
        //     else
        //     {
        //         System.out.print("]");
        //     }
        // }

        // String arr[]={"Harsh Shukla","Aman Tiwari","Harsh Kasana","harsh","Khushi shukla","harsh","aayush"};
        // String key="harsh";
        // boolean isFound=false;

        // for (int i = 0; i < arr.length; i++) 
        // {
        //     if (arr[i].equals(key)) 
        //     {
        //         System.out.println(key+" Found at index "+i);
        //         isFound=true;
        //         break;
        //     }
        // }
        // if (!isFound) 
        // {
        //     System.out.println("Not found in array");
        // }

        //Binary search
        int arr[]=new int[10];
        
        for (int i = 0; i < arr.length; i++) 
            arr[i]=10*(i+1);
        
        // System.out.println(Arrays.toString(arr));
        int lower,upper,mid,key;
        key=70;
        lower=0;
        upper=arr.length-1;
        
        for (int i = 0; i < arr.length; i++) 
        {
            mid=(lower+upper)/2;
            // System.out.println("Lower :"+lower+" upper:"+upper+" Mid:"+mid);
            if (arr[mid]==key) 
            {
                System.out.println(key+" found at index position "+mid);
                break;
            }
            if (key<arr[mid]) 
            {
                lower=0;
                upper=mid-1;
            }
            if(key>arr[mid])
            {
                lower=mid+1;
                upper=arr.length-1;
                System.out.println("Lower :"+lower+" upper:"+upper+" Mid:"+mid);
            }
        }
        System.out.println(Arrays.binarySearch(arr, 70));
    } 
}