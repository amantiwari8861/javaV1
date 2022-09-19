import java.util.Arrays;

public class SubArr {

    public static void main(String[] args) {
        

        int arr[]={6,-1,2,1,-1},sum;

        int arr2[]=new int[5];//prefix-sum array
        arr2[0]=arr[0];

        for (int i = 0; i < arr.length-1; i++)
        {
            // System.out.println("arr2["+(i+1)+"] = "+arr2[i]+"+"+arr[i+1]);
            arr2[i+1]=arr2[i]+arr[i+1];
        }
        System.out.println(Arrays.toString(arr2));
    }
}