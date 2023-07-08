import java.util.Arrays;

class ArraysDemo 
{
    static void insertAtPos(int arr[], int value, int pos) 
    {
        if (pos >= arr.length || pos < 0) 
        {
            System.out.println("invalid position");
            System.exit(0);
        }
        else
        {
            for (int i = arr.length - 1; i > pos; i--) 
            {
                arr[i] = arr[i - 1];
            }
            arr[pos] = value;
        }
    }

    public static void main(String[] args) {

        int arr[] = new int[6];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 40;
        arr[3] = 50;
        arr[4] = 60;

        System.out.println(Arrays.toString(arr));
        insertAtPos(arr, 30, -2);
        System.out.println("After inserting :" + Arrays.toString(arr));

    }
}