import java.util.Arrays;

public class ArraySortWith1Loop 
{
    void sortArr(int arr[])
    {
        for (int j = 0; j < arr.length-1; j++) {
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                j=-1;
            }
        }
    }
    public static void main(String[] args) {
        
    int arr[]={12,56,87,29,98,43};

    System.out.println(Arrays.toString(arr));
    ArraySortWith1Loop obj=new ArraySortWith1Loop();
    obj.sortArr(arr);
    System.out.println(Arrays.toString(arr));

    }
}